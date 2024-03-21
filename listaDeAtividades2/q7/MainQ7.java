package listaDeAtividades2.q7;

import structures.queue.InterfaceQueue;
import structures.queue.QueueList;

public class MainQ7 {
    public static void main(String[] args) {
        int returnValue;

        InterfaceQueue<Integer> queue2 = new QueueList<Integer>();

        try {
            queue2.add(3);
            queue2.add(5);
            queue2.add(7);
            // queue2.add(12); // this won't work!

            returnValue = queue2.peek();
            System.out.println("first element = " + returnValue + "\n");

            queue2.show();

            returnValue = queue2.remove();
            System.out.println("removed = " + returnValue + "\n");

            returnValue = queue2.remove();
            System.out.println("removed = " + returnValue + "\n");

            returnValue = queue2.remove();
            System.out.println("removed = " + returnValue + "\n");

            // returnValue = queue2.remove(); // this won't work!
            // System.out.println("removed = " + returnValue);

            queue2.show();

            queue2.isFull();

            queue2.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}