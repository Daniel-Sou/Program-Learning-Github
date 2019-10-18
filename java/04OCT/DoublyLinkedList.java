// Doubly-Linked List in Java

// A basic 
...

private Node <E> header; // header sentinel
private Node <E> trailer; // trailer sentinel
private int size = 0; // number of elements in the list

// Construct a new empty list
public DoublyLinkedList() {
  header = new Node<> (null,null,null); // create header
  trailer = new Node<> (null,header,null) // trailer is preceded by header
  header.setNext(trailer); // header is followed by trailer
}

// Returns the number of elements in the linked list
public int size() {
  return size;
}

// Tests whether the linked list is empty;
...

public void addFirst(E e) {
  addBetween(e, header, header.getNext());
}

public void addLast(E e) {
  addBetween(e, trailer.getPrev(), trailer);
}

public E removeFirst() {
  if (isEmpty()) return null;
}

...

private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
  //
  Node<E> newest = new Node<>()
}

//
