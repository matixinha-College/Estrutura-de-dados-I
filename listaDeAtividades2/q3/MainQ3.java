package listaDeAtividades2.q3;

import structures.list.InterfaceList;
import structures.list.LinkedListSingly;

public class MainQ3 {
    public static void main(String[] args) {
        // Create a new SinglyLinkedList
        InterfaceList<Integer> list = new LinkedListSingly<>();

        // Add elements to the list
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addAfter(5, 3);

        // Print the list
        System.out.println("List: " + list);

        // Get the size of the list
        System.out.println("Size: " + list.getSize());

        // Check if the list is empty
        System.out.println("Is empty? " + list.isEmpty());

        // Remove elements from the list
        list.removeFirst();
        list.removeLast();

        // Print the updated list
        System.out.println("Updated list: " + list);
    }
}