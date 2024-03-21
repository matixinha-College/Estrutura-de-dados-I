package structures.queue;

import Exception.MyException;

public interface InterfaceQueue <T>
{
    void add(T number) throws MyException;

    T remove() throws MyException;
    
    T peek() throws MyException;
    
    boolean isEmpty();

    boolean isFull();
    
    void show();

    int getSize();
}