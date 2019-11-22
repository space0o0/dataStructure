import javafx.scene.shape.Circle;

public class Main {

    public static void main(String args[]) {

        ArrayQueue arrayQueue = new ArrayQueue(10);
        LinkedQueue linkedQueue = new LinkedQueue();
        CircleQueue circleQueue = new CircleQueue(10);

        for (int i = 0; i < 10; i++) {
//            arrayQueue.enqueue(i + "");
//            linkedQueue.enqueue(i + "");
            circleQueue.enqueue(i + "");
        }

//        System.out.println(arrayQueue.toString1());
//        System.out.println(linkedQueue.toString1());
        System.out.println(circleQueue.toString1());

        circleQueue.dequeue();
        circleQueue.dequeue();
        circleQueue.dequeue();

//        System.out.println(arrayQueue.toString1());
//        System.out.println(linkedQueue.toString1());
        System.out.println(circleQueue.toString1());
    }
}
