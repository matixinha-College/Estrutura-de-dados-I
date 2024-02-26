public interface InterfaceQueue <T>
{
    void add(T number) throws Exception;

    T remove() throws Exception;
    
    T peek() throws Exception;
    
    boolean isEmpty();

    boolean isFull();
    
    void show();
}