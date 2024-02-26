public class Main 
{
    public static void main(String[] args) 
    {
        int retorno;

        InterfaceQueue<Integer> fila1 = new QueueArray<Integer>(3);
        // InterfaceQueue<Integer> fila1 = new QueueList<Integer>(3);

        try 
        {
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
    }

}