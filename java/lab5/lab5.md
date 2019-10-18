# Lab 05 Singly linked List

**Java program to create a Circular Linked List of n nodes and display it in reverse order**

## Algorithm
Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: add(), display() and reverse().
add() will add a node to the list:
It first checks whether the head is null, then it will insert the node as the head.
Both head and tail will point to the newly added node.
If the head is not null, the new node will be the new tail, and new tail will point to head as it is a circular linked list.
a. display() will show all the nodes present in the list.

Define a new node 'current' that will point to the head.
Print current.data till current will points to head again.
Current will point to the next node in the list in each iteration.
a. reverse() will print the circular linked list in reverse order.


This method checks whether next node to current is head which implies that, current is pointing to tail, then it will print the data of the tail node.
Recursively call reverse() by considering node next to current node and prints out all the nodes in reverse order starting from the tail.