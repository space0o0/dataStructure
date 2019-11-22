public class CircleQueue implements IQueue {

    private String items[];
    private int n;
    private int head = 0;
    private int tail = 0;

    public CircleQueue(int size) {
        this.n = size;
        items = new String[size];
    }

    @Override
    public void enqueue(String value) {

        //判断是否满了
        if ((tail + 1) % n == head) {
            return;
        }
        items[tail] = value;
        tail = (tail + 1) % n;
    }

    @Override
    public String dequeue() {

        if (head == tail) {
            return "null";//队列为空
        }
        String value = items[head];
        head = (head + 1) % n;
        return value;
    }

    public StringBuilder toString1() {

        StringBuilder sb = new StringBuilder();
        for (int i = head; i != tail; i = (i + 1) % n) {
            sb.append(items[i]).append(",");
        }
        return sb;
    }

}
