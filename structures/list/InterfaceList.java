package structures.list;

public interface InterfaceList <E> {
    //criterio - valor
    void addFirst(E value);
    void addLast(E value);
    boolean addAfter(E value, E crit);

    E removeFirst();
    E removeLast();
    E removeAfter(E crit);

    E peekFirst();
    E peekLast();
    
    E search(E crit);

    boolean isEmpty();

    void show();
    void showReverse();

    int getSize();
}
