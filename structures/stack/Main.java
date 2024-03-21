package structures.stack;

public class Main {

    public static void main(String[] args) {
        int retorno;

        InterfaceStack<Integer> pilha1 = new StackArray<Integer>(3);

        try {
            pilha1.push(3);
            pilha1.push(5);
            pilha1.push(7);
            // pilha1.push(12); // nao vai dar certo!

            retorno = pilha1.peek();
            System.out.println("elemento no topo = " + retorno);

            pilha1.show();

            retorno = pilha1.pop();
            System.out.println("desempilhado = " + retorno);

            retorno = pilha1.pop();
            System.out.println("desempilhado = " + retorno);

            retorno = pilha1.pop();
            System.out.println("desempilhado = " + retorno);

            // retorno = pilha1.pop(); // nao vai dar certo!
            // System.out.println("desempilhado = " + retorno);

            pilha1.show();

            System.out.println("full? " + pilha1.isFull());

            System.out.println("empty? " + pilha1.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");
        System.out.println("Testando pilha com lista encadeada\n\n\n");
        int retorno2;
        InterfaceStack<Integer> pilha2 = new StackList<Integer>();

        try {
            pilha2.push(3);
            pilha2.push(5);
            pilha2.push(7);
            // pilha2.push(12); // nao vai dar certo!

            retorno2 = pilha2.peek();
            System.out.println("elemento no topo = " + retorno2);

            pilha2.show();

            retorno2 = pilha2.pop();
            System.out.println("desempilhado = " + retorno2);

            retorno2 = pilha2.pop();
            System.out.println("desempilhado = " + retorno2);

            retorno2 = pilha2.pop();
            System.out.println("desempilhado = " + retorno2);

            // retorno2 = pilha2.pop(); // nao vai dar certo!
            // System.out.println("desempilhado = " + retorno2);

            pilha2.show();

            System.out.println("full? " + pilha2.isFull());

            System.out.println("empty? " + pilha2.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}