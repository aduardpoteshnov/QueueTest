public class TestObject {
    String payload;
    long date;

    public TestObject(String payload, long date) {
        this.payload = payload;
        this.date = date;
    }

    public String toString() {
        return "TestObject{" +
                "payload='" + payload + '\'' +
                ", date=" + date +
                '}';
    }
}
