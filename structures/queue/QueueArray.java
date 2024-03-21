package structures.queue;

import Exception.MyException;

public class QueueArray<T> implements InterfaceQueue<T> 
{
	private int size;
	private Object[] array;
	private int i; // Inicio
	private int f; // Final

	public QueueArray(int size) 
	{
		this.f = -1;
		this.i = -1;
		this.size = size;
		this.array = new Object[size];
	}

	public void add(T valor) throws MyException 
	{
		int fc = f + 1 % size;

		if (fc == i)
			throw new MyException("Fila está cheia!");

		f = fc;
		array[f] = valor;

		if (i == -1) // Primeiro elemento adicionado a fila
			i = 0;
	}

	@SuppressWarnings("unchecked")
	public T remove() throws MyException 
	{
		if (isEmpty())
			throw new MyException("Fila está vazia!");

		T retorno = (T) array[i];

		if (f == i) 
		{
			i = -1;
			f = -1;
		} else
			i = i + 1 % size;

		return retorno;
	}

	@SuppressWarnings("unchecked")
	public T peek() throws MyException 
	{
		System.out.println("");

		if (isEmpty()) 
			throw new MyException("Fila está vazia!");

		T retorno = (T) array[i];

		return retorno;
	}

	public boolean isFull() 
	{
		int fc = f + 1 % size;

		if (fc == 1)
			return true;
		else
			return false;		
	}

	public boolean isEmpty() 
	{
		if (i == -1)
			return true;
		else
			return false;		
	}

	public void show() 
	{

		if (i == -1)
			System.out.println("-VAZIA-");

		else 
		{
			int x = i;
			int a = 1;
			while (x != f) 
			{
				System.out.println("posicao " + a + "º = " + array[x] + "\n");
				x = (x + 1) % size;
				a++;
			}
			System.out.println("posicao " + a + "º = " + array[x] + "\n");

		}
		// for(x=i; x <= f + 1 % size; x++) {
		// System.out.println("posicao " + x + " = " + array[x] + "\n");
		// }
	}

	public int getSize() 
	{
		return size;
	}
}