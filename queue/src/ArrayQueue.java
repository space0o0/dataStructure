public class ArrayQueue implements IQueue {

    private String[] items;//存储的数组
    private int n = 0;//数组长度
    private int head = 0;//头指针
    private int tail = 0;//尾指针

    public ArrayQueue(int size) {
        items = new String[size];
        this.n = size;
    }

    //入队
    @Override
    public void enqueue(String value) {
        if (tail == n) {
            //队列末尾没有空间了
            if (head == 0) {
                //整个数组满了
                return;
            }
            //当出队后，head前面有剩余空间，把数据搬移到从下标0开始
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];//head开始的数据往下标0开始搬移
            }
        }

        items[tail] = value;
        tail++;
    }

    //出队
    @Override
    public String dequeue() {
        if (head == tail) {
            return null;//队列为空
        }
        String value = items[head];
        head++;
        return value;
    }

    public StringBuilder toString1() {
        StringBuilder sb = new StringBuilder();
        for (int i = head; i < tail; i++) {
            sb.append(items[i]).append(",");
        }
        return sb;
    }
}
