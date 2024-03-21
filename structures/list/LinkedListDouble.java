package structures.list;

public class LinkedListDouble<T> implements InterfaceList<T> {

    // Internal Class Node

    // SinglyLinkedList Attributes
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        T data;
        Node next;
        Node prev;

        // Private constructor
        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public LinkedListDouble() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // SinglyLinkedList Methods for Node Types
    private Node searchNode(T crit) {
        Node t = head;
        while (t != null) {
            if (t.data.equals(crit)) {
                return t;
            }
            t = t.next;
        }
        return null;

    }

    public void addFirst(T value) {

        Node n = new Node(value);

        if (size == 0) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }

    public void addLast(T value) {

        Node n = new Node(value);

        if (size == 0) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    public boolean addAfter(T value, T crit) {
        Node t = searchNode(crit);

        if (t == null) {
            System.out.println("Element not found");
            return false;
        } else {
            Node n = new Node(value);
            if (n.next != null) {
                tail = n;
            }
            n.next = t.next;
            n.prev = t;
            t.next = n;

            Node frente = n.next;
            if (frente != null) {
                frente.prev = n;
            }
            size++;
            return true;
        }
    }

    public T removeFirst() {
        Node t = head;
        T rData = null;

        if (head == null) {
            System.out.println("Empty list");
            return null;
        }
        if (head == tail) {
            rData = head.data;
            head = null;
            tail = null;
            System.out.println("last element removed from list");
            size--;
        } else {
            head = head.next;
            head.prev = null;
        }

        t.next = null;

        size--;

        return rData;
    }

    public T removeLast() {
        T rData = null;

        if (tail == null) {
            System.out.println("Empty list");
            return null;
        } else {
            rData = tail.data;
            if (head == tail) {
                head = null;
                tail = null;
                System.out.println("last element removed from list");
            } else {
                System.out.println("element removed from list");
                Node tBefore = tail.prev;
                tail.prev = null;
                tail = tBefore;
                tail.next = null;
            }
            size--;
        }
        return rData;
    }

    public T removeAfter(T crit) {
        T rData = null;

        if (head == null) {
            System.out.println("Empty list");
            return null;
        }

        Node tBefore = null;
        Node removed = searchNode(crit);

        if(removed != null){
            tBefore = removed.next;
        }

        if (tBefore == null) {
            if (head.data.equals(crit)==false){
                System.out.println("Element not found");
                return null;
            }else{
                return removeFirst();
            }
            
        }else{
            System.out.println("element removed from list");

            if (removed==tail){
                return removeLast();
            }else{
                Node frente = removed.next;
                
                tBefore.next = frente;
                frente.prev = tBefore;

                removed.next = null;
                removed.prev = null;

                rData = removed.data;

                size--;
                return rData;
            }
        }

    }

    public T peekFirst() {
        // peekFirst
        if (head == null) {
            System.out.println("Empty list");
            return null;
        }
        return head.data;

    }

    public T peekLast() {
        // peekLast
        if (head == null) {
            System.out.println("Empty list");
            return null;
        }
        return tail.data;
    }

    public T search(T crit) {
        Node t = searchNode(crit);
        if (t == null) {
            return null;
        }
        return t.data;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }

        return true;
    }

    public void show() {
        Node t = head;

        if (t == null) {
            System.out.println("Empty list");
            return;
        }
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    public void showReverse() {
        Node t = tail;

        if (t == null) {
            System.out.println("Empty list");
            return;
        }
        while (t != null) {
            System.out.println(t.data);
            t = t.prev;
        }
    }

    public int getSize() {
        return size;
    }
}