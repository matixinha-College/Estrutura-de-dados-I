package listaDeAtividades2.q6;

import structures.stack.InterfaceStack;
import structures.stack.StackList;

public class MainQ6 {

    public static void main(String[] args) {
        int result;
        InterfaceStack<Integer> stack2 = new StackList<Integer>();

        try {
            stack2.push(3);
            stack2.push(5);
            stack2.push(7);
            // stack2.push(12); // this won't work!

            result = stack2.peek();
            System.out.println("top element = " + result);

            stack2.show();

            result = stack2.pop();
            System.out.println("popped element = " + result);

            result = stack2.pop();
            System.out.println("popped element = " + result);

            result = stack2.pop();
            System.out.println("popped element = " + result);

            // result = stack2.pop(); // this won't work!
            // System.out.println("popped element = " + result);

            stack2.show();

            System.out.println("full? " + stack2.isFull());

            System.out.println("empty? " + stack2.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}