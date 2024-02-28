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

    //SinglyLinkedList Methods for Node Types
    private Node searchNode(T crit){
        Node t = head;

        while(sn!=null){
            if(sn.data.equals(crit)){
                return sn;
            }

            sn = sn.next;
        }
        return null;
    }
    private Node searchNodeBefore(T crit){
        
        Node t = head;
        Node tBefore = null;

        while (t!=null){
            tBefore=t;
            t=t.next;
            
            if(t!=null && t.data.equals(crit)){
                return tBefore;
            }
        }
        return null;
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
        Node t = searchNode(crit);
        
        if(t.next!=null){
            n.next = t.next;
            t.next = n;
        }else{
            t.next = n;
            tail = n;
        }
    }

    @Override
    public T removeFirst() {
        T rData = null;

        if (head==tail){
            rData = head.data;
            head=null;
            tail=null;
        }else{
            rData = head.data;
            head.next=head.next.next;
            head = head.next;
        }
        return rData;
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