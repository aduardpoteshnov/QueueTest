import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<TestObject> queue;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        queue = new LinkedList<>();
        QueueHandler queueHandler = new QueueHandler();
        queueHandler.start();

        for (int i = 0; i < 5; i++) {
            queue.add(new TestObject(br.readLine(), System.currentTimeMillis()));
        }

        System.out.println("After adding 5 elements to the queue:");
        queue.forEach(object -> executor(object.toString()));
    }

    public static void executor(String message) {
        System.out.println(message);
    }

    public static Queue<TestObject> getQueue() {
        return queue;
    }
}