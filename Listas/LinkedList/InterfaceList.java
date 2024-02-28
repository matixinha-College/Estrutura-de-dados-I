package Listas.LinkedList;

public interface InterfaceList <E> {
    //criterio - valor
    void addFirst(E value);
    void addLast(E value);
    void addAfter(E value, E crit);

    E removeFirst();
    E removeLast();
    E removeAfter(E crit);

    E peekFirst();
    E peekLast();
    
    E search(E crit);

    boolean isEmpty();

    void show();
    void showReverse();
}
