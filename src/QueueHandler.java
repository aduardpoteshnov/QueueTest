import java.util.Iterator;
import java.util.Queue;

public class QueueHandler extends Thread {
    Queue<TestObject> queue;

    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                queue = Main.getQueue();
                if (queue != null) {
                    System.out.println("QueueHandler runs");
                    for (Iterator<TestObject> it = queue.iterator(); it.hasNext(); ) {
                        TestObject object = it.next();
                        if (System.currentTimeMillis() - object.date > 5000) {
                            Main.executor(object.toString());
                            it.remove();
                        }
                    }
                }
                System.out.println("QueueHandler falls asleep");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}