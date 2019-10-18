public int countNodes() {
    int counter = 0;

    // Node current will point to head
    Node<E> current = head;

    while (current !=null) {
        // Increment the counter by 1 for each node
        counter ++;
        current = current.getNext();
    }

    return counter;
}