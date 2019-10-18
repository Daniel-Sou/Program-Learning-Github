# Lab 06

Java - Lab class

**Create a doubly linked list of n nodes and count the number of nodes**
(Using the code in the lecture note first, then the following)

`countNode()` will count the nodes present in the list
```java
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
```

`display()` will print out the elements of the list
```java
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
}
```