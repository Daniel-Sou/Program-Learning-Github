// Create a doubly linked list of n nodes and count the number of nodes

public class countNodes {
    public int countNodes() {
        int counter = 0;

        // Node current will point to head
        Node<E> current = head;

        while (current != null) {
            // Increment the counter by 1 for each node
            counter++;
            current = current.getNext();
        }
        return counter;
    }

    public void display() {
        // Node current will point to head
        Node<E> current = head;
        if (head == null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();

        // Add nodes to the list
        dList.addFirst(1);
        dList.addLast(2);
        dList.addLast(3);
        dList.addLast(4);
        dList.addLast(5);

        // Displays the nodes present in the list
        dList.display();

        // Counts the nodes present in the given list
        System.out.println("\nCount of nodes present in the list: " + dList.countNodes());
    }
}