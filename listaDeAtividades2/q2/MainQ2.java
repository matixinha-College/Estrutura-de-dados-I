package listaDeAtividades2.q2;

import structures.queue.InterfaceQueue;
import structures.queue.QueueArray;

public class MainQ2 {
    public static void main(String[] args) {
        int result;

        InterfaceQueue<Integer> queue1 = new QueueArray<Integer>(3);

        try {
            queue1.add(3);
            queue1.add(5);
            queue1.add(7);
            // queue1.add(12); // this won't work!

            queue1.getSize();

            result = queue1.peek();
            System.out.println("first element = " + result + "\n");

            queue1.show();

            result = queue1.remove();
            System.out.println("removed = " + result + "\n");

            result = queue1.remove();
            System.out.println("removed = " + result + "\n");

            result = queue1.remove();
            System.out.println("removed = " + result + "\n");

            queue1.getSize();

            // result = queue1.remove(); // this won't work!
            // System.out.println("removed = " + result);

            queue1.show();

            queue1.isFull();

            queue1.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}