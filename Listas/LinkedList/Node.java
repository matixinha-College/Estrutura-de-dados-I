package Listas.LinkedList;

public class Node<T> {
        T data;
        Node next;

        //Private constructor
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
