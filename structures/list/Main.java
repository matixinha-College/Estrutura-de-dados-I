package structures.list;

public class Main {
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

        // Print the list in reverse
        list.showReverse();

        // Search for an element in the list
        System.out.println("Search for 5: " + list.search(5));

        System.out.println("--------------------------------------------------");
        System.out.println("testing LinkedListDouble");
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