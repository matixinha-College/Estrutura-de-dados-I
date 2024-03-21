package structures.list;

public class LinkedListSingly<T> implements InterfaceList<T> {

    // Internal Class Node

    // SinglyLinkedList Attributes
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        public T data;
        public Node next;

        // Private constructor
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListSingly() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // SinglyLinkedList Methods for Node Types
    public Node searchNode(T crit) {
        Node t = head;
        while (t != null) {
            if (t.data.equals(crit)) {
                return t;
            }
            t = t.next;
        }
        return null;

    }

    private Node searchNodeBefore(T crit) {

        Node t = head;
        Node tBefore = null;

        while (t != null) {
            tBefore = t;
            t = t.next;

            if (t != null && t.data.equals(crit)) {
                return tBefore;
            }
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
            t.next = n;
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
            size--;
        }

        t.next = null;

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
                Node t = head;
                while (t.next != tail) {
                    t = t.next;
                }
                tail = t;
                tail.next = null;
            }
            size--;
        }
        return rData;
    }

    public T removeAfter(T crit) {
        Node t = searchNodeBefore(crit);
        Node tAfter = t.next;
        T rData = null;

        if (tAfter != null) {
            rData = tAfter.data;
            t.next = tAfter.next;
            tAfter.next = null;
            size--;
        }

        return rData;

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
        Node t = head;
        Node tBefore = null;
        Node tNext = null;

        if (t == null) {
            System.out.println("Empty list");
            return;
        }
        while (t != null) {
            tNext = t.next;
            t.next = tBefore;
            tBefore = t;
            t = tNext;
        }
        head = tBefore;
        show();
    }

    public int getSize() {
        return size;
    }

    public int indexOf(Node node) {
        int index = 0;
        Node t = head;
        while (t != null) {
            if (t == node) {
                return index;
            }
            t = t.next;
            index++;
        }
        return -1;

    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.data;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        t.data = (T) value;
    }

    public Node getHead() {
        return head;
    }
}