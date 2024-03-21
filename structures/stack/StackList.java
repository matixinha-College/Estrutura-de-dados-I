package structures.stack;

import Exception.MyException;

public class StackList<T> implements InterfaceStack<T> {
    // Inner class Node
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
    public StackList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.capacity = -1;
    }

    // Constructor
    public StackList(long capacity) {
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
    public void push(T data) throws MyException {
        // Add at the beginning
        Node newNode = new Node(data);

        if (isFull()) {
            throw new MyException("Full!");
        }

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
    public T pop() throws MyException {
        // Remove from the beginning
        Node p = head;
        T returnedData = null;

        if (isEmpty()) {
            throw new MyException("Empty!");
        } else {
            returnedData = head.data;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }

            p.next = null; // isolate the removed element

            size--;
        }

        return returnedData;
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