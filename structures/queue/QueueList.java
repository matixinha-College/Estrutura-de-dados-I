package structures.queue;

import Exception.MyException;

public class QueueList<T> implements InterfaceQueue<T> {
    // Inner Node class
    class Node {
        // Node attributes
        T data;
        Node next;

        // Node constructor
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Attributes
    private Node head;
    private Node tail;
    private int size;
    private long capacity;

    // Constructor
    public QueueList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.capacity = -1;
    }

    // Constructor
    public QueueList(long capacity) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public long getCapacity() {
        return capacity;
    }

    @Override
    public void add(T data) throws MyException {
        // Add at the end
        if (isFull()) {
            throw new MyException("Full!");
        }

        Node newNode = new Node(data);

        // Check if the list is empty
        if (head == null) {
            head = newNode; // newNode will be the first element
            tail = newNode; // newNode will be the last element
        } else {
            // Append
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    @Override
    public T remove() throws MyException {
        // Remove from the beginning
        Node p = head;
        T dataToRemove = null;

        if (isEmpty()) {
            throw new MyException("Empty!");
        } else {
            dataToRemove = head.data;

            if (head == tail) {
                System.out.println("Remove only element\n");
                head = null;
                tail = null;
            } else {
                System.out.println("Remove first element, but there are more\n");
                head = head.next;
            }

            p.next = null; // isolate the removed element

            size--;
        }

        return dataToRemove;
    }

    @Override
    public T peek() throws MyException {
        // Peek at the beginning
        if (head == null) {
            System.out.println("Empty List!!! \n");
            return null;
        } else {
            return head.data;
        }
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public boolean isFull() {
        if (capacity == -1) {
            return false;
        } else {
            if (size == capacity) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public void show() {
        Node p = head;

        if (p == null) {
            System.out.println("EMPTY LIST \n");
        } else {
            while (p != null) {
                System.out.println("Data: " + p.data);
                p = p.next;
            }
        }

        System.out.println("size = " + size + "\n");
    }

}