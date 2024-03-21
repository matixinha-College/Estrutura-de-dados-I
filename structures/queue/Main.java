package structures.queue;

public class Main {
    public static void main(String[] args) {
        int retorno;

        InterfaceQueue<Integer> fila1 = new QueueArray<Integer>(3);

        try {
            fila1.add(3);
            fila1.add(5);
            fila1.add(7);
            // fila1.add(12); // nao vai dar certo!

            retorno = fila1.peek();
            System.out.println("primeiro elemento = " + retorno + "\n");

            fila1.show();

            retorno = fila1.remove();
            System.out.println("removido = " + retorno + "\n");

            retorno = fila1.remove();
            System.out.println("removido = " + retorno + "\n");

            retorno = fila1.remove();
            System.out.println("removido = " + retorno + "\n");

            // retorno = fila1.remove(); // nao vai dar certo!
            // System.out.println("removido = " + retorno);

            fila1.show();

            fila1.isFull();

            fila1.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");
        System.out.println("Testando fila com lista encadeada\n\n\n");
        int retorno2;

        InterfaceQueue<Integer> fila2 = new QueueList<Integer>();

        try {
            fila2.add(3);
            fila2.add(5);
            fila2.add(7);
            // fila2.add(12); // nao vai dar certo!

            retorno2 = fila2.peek();
            System.out.println("primeiro elemento = " + retorno2 + "\n");

            fila2.show();

            retorno2 = fila2.remove();
            System.out.println("removido = " + retorno2 + "\n");

            retorno2 = fila2.remove();
            System.out.println("removido = " + retorno2 + "\n");

            retorno2 = fila2.remove();
            System.out.println("removido = " + retorno2 + "\n");

            // retorno2 = fila2.remove(); // nao vai dar certo!
            // System.out.println("removido = " + retorno2);

            fila2.show();

            fila2.isFull();

            fila2.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}