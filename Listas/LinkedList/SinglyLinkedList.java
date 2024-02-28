package Listas.LinkedList;

public class SinglyLinkedList<T> implements InterfaceList<T> {

    //Internal Class Node

    //SinglyLinkedList Attributes
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    @Override
    public void addFirst(T value) {

        Node n = new Node(value);
        
        if(size==0){
            head = n;
            tail = n;
        }    
        else{
            n.next = head;
            head = n;
        }
        size++;
    }

    @Override
    public void addLast(T value) {

        Node n = new Node(value);

        if(size==0){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=n;
        }
        size++;
    }

    @Override
    public void addAfter(T value, T crit) {
        Node n = new Node(value);
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T removeAfter(T crit) {
        return null;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public T search(T crit) {
        return null;
    }

    @Override
    public boolean isEmpty(){
        if(head==null || tail==null || size==0){
            return true;
        }

        return false;
    }
    @Override
    public void show() {
    }

    @Override
    public void showReverse() {
    }
}