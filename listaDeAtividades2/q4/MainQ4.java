package listaDeAtividades2.q4;

import structures.list.InterfaceList;
import structures.list.LinkedListDouble;

public class MainQ4 {
    public static void main(String[] args) {
        // Create a new DoublyLinkedList
        InterfaceList<Integer> list2 = new LinkedListDouble<>();

        // Add elements to the list
        list2.addFirst(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.addAfter(5, 3);

        // Print the list
        System.out.println("List: " + list2);

        // Get the size of the list
        System.out.println("Size: " + list2.getSize());

        // Check if the list is empty
        System.out.println("Is empty? " + list2.isEmpty());

        // Remove elements from the list
        list2.removeFirst();

        // Print the updated list
        System.out.println("Updated list: " + list2);

        // Print the list in reverse
        list2.showReverse();

        // Search for an element in the list
        System.out.println("Search for 5: " + list2.search(5));
    }
}