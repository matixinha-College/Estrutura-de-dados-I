package structures.stack;

public class StackArray<T> implements InterfaceStack<T> {
    private T[] stack;
    private int top;
    private int size;

    @SuppressWarnings("unchecked")
    public StackArray(int size) {
        this.size = size;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top--];
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
    
    public int getSize() {
        return top + 1;
    }
}
