package structures.stack;

import Exception.MyException;

public interface InterfaceStack<T> {
    void push(T value) throws MyException;

    T pop() throws MyException;

    T peek() throws MyException;

    boolean isEmpty();

    boolean isFull();

    void show();

    int getSize();
}
