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
}
```

## Exercise

```java

```