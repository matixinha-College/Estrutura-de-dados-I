package listaDeAtividades2.q1;

import structures.stack.InterfaceStack;
import structures.stack.StackArray;

public class MainQ1 {

    public static void main(String[] args) {
        int retorno;

        InterfaceStack<Integer> pilha1 = new StackArray<Integer>(3);

        try {
            pilha1.push(3);
            pilha1.push(5);
            pilha1.push(7);
            // pilha1.push(12); // nao vai dar certo!

            pilha1.getSize();

            retorno = pilha1.peek();
            System.out.println("elemento no topo = " + retorno);

            pilha1.show();

            retorno = pilha1.pop();
            System.out.println("desempilhado = " + retorno);

            retorno = pilha1.pop();
            System.out.println("desempilhado = " + retorno);

            retorno = pilha1.pop();
            System.out.println("desempilhado = " + retorno);

            pilha1.getSize();

            // retorno = pilha1.pop(); // nao vai dar certo!
            // System.out.println("desempilhado = " + retorno);

            pilha1.show();

            System.out.println("full? " + pilha1.isFull());

            System.out.println("empty? " + pilha1.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}