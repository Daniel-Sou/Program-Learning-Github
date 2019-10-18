# Lab 06

Java - Lab class

## Practise

**Create a doubly linked list of n nodes and count the number of nodes**

(Using the code in the lecture note first, then the following)

In this program, we will create a doubly linked list and count the number of nodes present in the list. To count the node, we traverse through the list by incrementing the counter by 1.

### Algorithm
1. Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.

2. Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.

3. `addNode()` will add node to the list:
    - It first checks whether the head is null, then it will insert the node as the head.
    - Both head and tail will point to a newly added node.
    - Head's previous pointer will point to null and tail? next pointer will point to null.
    - If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
    - The new node will become the new tail. Tail's next pointer will point to null.

4. `countNodes()` will count the number of nodes present in the list.
    - Define a variable counter and new node current which will point to the head node.
    - Traverse through the list to count the nodes by making the current node to point to next node in the list till current point to null.
    - Increment the counter by 1.

5. `display()` will show all the nodes present in the list.
Define a new node 'current' that will point to the head.
Print current.data till current points to null.
Current will point to the next node in the list in each iteration.

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
    dList.addLast(4);
    dList.addLast(5);

    // Displays the nodes present in the list
    dList.display();

    // Counts the nodes present in the given list
    System.out.println("\nCount of nodes present in the list: " + dList.countNodes());
}
```

Reference:
https://www.javatpoint.com/program-to-create-a-doubly-linked-list-of-n-nodes-and-count-the-number-of-nodes

## Exercise

**Develop a general program: Rotate a doubly linked list by N nodes.**

### Algorithm
1. Define a Node class which represents a node in the list. 

    It will have three properties: 
    data, previous which will point to the previous node and next which will point to the next node.

2. Define another class for creating the doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.

3. `addNode()` will add node to the list:
    - It first checks whether the head is null, then it will insert the node as the head.
    - Both head and tail will point to a newly added node.
    - Head's previous pointer will point to null and tail's next pointer will point to null.
    - If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
    - The new node will become the new tail. Tail's next pointer will point to null.

4. `rotateList()` will rotate the list by given n nodes.
    - First, check whether n is 0 or greater than or equal to many nodes present in the list.
    - If yes, print the list as it is.
    - If no, define a node current which will point to head.
    - Iterate through the list till current reaches the nth node.
    - Tail's next will point to head node.
    - Make node next to current as the new head. Head's previous will point to null.
    - The current node will become tail of the list. Tail's next will point to null.

5. `display()` will show all the nodes present in the list.
    - Define a new node 'current' that will point to the head.
    - Print current.data till current points to null.
    - Current will point to the next node in the list in each iteration.

Reference:
https://www.javatpoint.com/program-to-rotate-doubly-linked-list-by-n-nodes
