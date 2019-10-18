public class rotateList {
    
    // Represent a node of the doubly linked list
    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    int size = 0;

    // Represent the head and tail of the doubly linked list
    Node head, tail = null;

    // addNode() will add a node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If list is emply
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;

            // Head's previous will point to null
            head.previous = null;
        }
    }
}