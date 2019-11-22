public class LinkedQueue implements IQueue {

    private Node head = null;
    private Node tail = null;

    /**
     * 链式队列没有数量限制，直接new
     */
    public LinkedQueue() {}

    @Override
    public void enqueue(String value) {
        Node newNode = new Node(value);

        if (head == null) {
            //队列为空时
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;//尾部添加新节点
        tail = tail.next;//tail指向尾部
    }

    @Override
    public String dequeue() {

        if (head == null) {
            return "null";
        }

        String value = head.value;
        head = head.next;//head指向下一个节点
        return value;
    }

    public StringBuilder toString1() {

        StringBuilder sb = new StringBuilder();
        Node node = head;
        while (node!= null) {
            sb.append(node.value).append(",");
            node = node.next;
        }
        return sb;
    }
}
