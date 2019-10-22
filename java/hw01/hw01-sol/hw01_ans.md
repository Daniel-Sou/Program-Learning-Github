## Problem 1. 
Write a class that maintains the top ten scores for a game application, implementing the add and remove methods, but using Singly Linked List instead of an array. 

The add and remove methods should behave like the ones in the Scoreboard class provided in canvas (the top ten list should keep the scores ordered in decreasing or increasing order). 

Create a Driver class to test your code.

## Problem2. 
Perform the previous problem using a Doubly Linked List. Your implementation of remove method should make the fewest number of pointer hops to get to the game entry. Create a Driver class to test your code.

Provided implementations: 
Singly Linked List and Doubly Linked List are provided below, a main() method that traverses the nodes of the Singly Linked List and prints its elements. There is no provided example for the Doubly Linked List, use a toString() method that fully traverses the list.

Please make sure to have read the instrustions in full for both problems, thank you.

Implementations:

`DoublyLinkedList.java`

```java
/* This is the DoublyLinkedList class provided. 
It contains a Nested class Node, like in the SinglyLinkedList I changed it to public so that you can create Node elements outside of the class.

* Again I have included two accessor methods getHead(), getTail(),

* which you need those in order to have access to the head and the tail of

* the linked list. Access to the head and tail is paramount when you

* want to perform an in order insertion in a linked list, since otherwise you

* cannot traverse the list.

*

* Finally you will need increment and decrement methods for the list size,

* since the size is private.

* You will have to create those on your own.

*/

public class DoublyLinkedList<E> {

//---------------- nested Node class ----------------

/**

   * Node of a doubly linked list, which stores a reference to its

   * element and to both the previous and next node in the list.

   */

public static class Node<E> {   // Sotiris: Changed this one to public

    /** The element stored at this node */

    private E element;               // reference to the element stored at this node

    /** A reference to the preceding node in the list */

    private Node<E> prev;            // reference to the previous node in the list

    /** A reference to the subsequent node in the list */

    private Node<E> next;            // reference to the subsequent node in the list

    /**

     * Creates a node with the given element and next node.

     *

     * @param e the element to be stored

     * @param p reference to a node that should precede the new node

     * @param n reference to a node that should follow the new node

     */

    public Node(E e, Node<E> p, Node<E> n) {

      element = e;

      prev = p;

      next = n;

    }

    // public accessor methods

    /**

     * Returns the element stored at the node.

     * @return the element stored at the node

     */

    public E getElement() { return element; }

    /**

     * Returns the node that precedes this one (or null if no such node).

     * @return the preceding node

     */

    public Node<E> getPrev() { return prev; }

    /**

     * Returns the node that follows this one (or null if no such node).

     * @return the following node

     */

    public Node<E> getNext() { return next; }

    // Update methods

    /**

     * Sets the node's previous reference to point to Node n.

     * @param p    the node that should precede this one

     */

    public void setPrev(Node<E> p) { prev = p; }

  /**

     * Sets the node's next reference to point to Node n.

     * @param n    the node that should follow this one

     */

    public void setNext(Node<E> n) { next = n; }

} //----------- end of nested Node class -----------

// instance variables of the DoublyLinkedList

/** Sentinel node at the beginning of the list */

private Node<E> header;                    // header sentinel

/** Sentinel node at the end of the list */

private Node<E> trailer;                   // trailer sentinel

/** Number of elements in the list (not including sentinels) */

private int size = 0;                      // number of elements in the list

/** Constructs a new empty list. */

public DoublyLinkedList() {

    header = new Node<>(null, null, null);      // create header

    trailer = new Node<>(null, header, null);   // trailer is preceded by header

    header.setNext(trailer);                    // header is followed by trailer

}

// public accessor methods

/**

   * Returns the number of elements in the linked list.

   * @return number of elements in the linked list

   */

public int size() { return size; }

/**

   * Tests whether the linked list is empty.

   * @return true if the linked list is empty, false otherwise

   */

public boolean isEmpty() { return size == 0; }

/**

   * Returns the header sentinel node of the linked list.

   * @return header node of the linked list

   */

public Node<E> getHeader() {                // Sotiris: Added getHeader() you should consider whether you need set methods also

      return header;

   }

/**

   * Returns the trailer sentinel node of the linked list.

   * @return trailer node of the linked list

   */

public Node<E> getTrailer() {                // Sotiris: Added getTrailer()

      return trailer;

}

/**

   * Returns (but does not remove) the first element of the list.

   * @return element at the front of the list (or null if empty)

   */

public E first() {

    if (isEmpty()) return null;

    return header.getNext().getElement();   // first element is beyond header

}

/**

   * Returns (but does not remove) the last element of the list.

   * @return element at the end of the list (or null if empty)

   */

public E last() {

    if (isEmpty()) return null;

    return trailer.getPrev().getElement();    // last element is before trailer

}

// public update methods

/**

   * Adds an element to the front of the list.

   * @param e   the new element to add

   */

public void addFirst(E e) {

    addBetween(e, header, header.getNext());    // place just after the header

}

/**

   * Adds an element to the end of the list.

   * @param e   the new element to add

   */

  public void addLast(E e) {

    addBetween(e, trailer.getPrev(), trailer); // place just before the trailer

}

/**

   * Removes and returns the first element of the list.

   * @return the removed element (or null if empty)

   */

public E removeFirst() {

    if (isEmpty()) return null;                  // nothing to remove

    return remove(header.getNext());             // first element is beyond header

}

/**

   * Removes and returns the last element of the list.

   * @return the removed element (or null if empty)

   */

public E removeLast() {

    if (isEmpty()) return null;                  // nothing to remove

    return remove(trailer.getPrev());            // last element is before trailer

}

// private update methods

/**

   * Adds an element to the linked list in between the given nodes.

   * The given predecessor and successor should be neighboring each

   * other prior to the call.

   *

   * @param predecessor   node just before the location where the new element is inserted

   * @param successor     node just after the location where the new element is inserted

   */

private void addBetween(E e, Node<E> predecessor, Node<E> successor) {

    // create and link a new node

    Node<E> newest = new Node<>(e, predecessor, successor);

    predecessor.setNext(newest);

    successor.setPrev(newest);

    size++;

}

/**

   * Removes the given node from the list and returns its element.

   * @param node    the node to be removed (must not be a sentinel)

   */

private E remove(Node<E> node) {

    Node<E> predecessor = node.getPrev();

    Node<E> successor = node.getNext();

    predecessor.setNext(successor);

    successor.setPrev(predecessor);

    size--;

    return node.getElement();

}

/**

   * Produces a string representation of the contents of the list.

   * This exists for debugging purposes only.

   */

public String toString() {

    StringBuilder sb = new StringBuilder("(");

    Node<E> walk = header.getNext();

    while (walk != trailer) {

      sb.append(walk.getElement());

      walk = walk.getNext();

      if (walk != trailer)

        sb.append(", ");

    }

    sb.append(")");

    return sb.toString();

}

} //----------- end of DoublyLinkedList class -----------
```

`SinglyLinkedList.java`

```java
/*************************************************************

This is the SinglyLinkedList class provided by your text. It

contains a Nested class Node, I changed it to public so that you

can create Node elements outside of the class.

Furthermore I have included two accessor methods getHead(), getTail(),

which you need those in order to have access to the head and the tail of

the linked list. Access to the head and tail is paramount when you

want to perform an in order insertion in a linked list, since otherwise you

cannot traverse the list.

Finally you will need increment and decrement methods for the list size,

since the size is private.

You will have to create those on your own.

**************************************************************/

public class SinglyLinkedList<E>{

  

   //---------Nested Node class-----------

   public static class Node<E>{

      private E element;        // content, this could be set to final

      private Node<E> next;     // next node in the list

  

      public Node(E e, Node<E> n){// constructor

         element = e;

         next = n;

      }

      // Necessary set and get methods

      public E getElement(){

         return element;

      }

      public Node<E> getNext() {

         return next;

      }

      public void setNext(Node<E> n){

         next = n;

      }

   }

   //------end of Nested Node class------

     

   private Node<E> head = null;

   private Node<E> tail = null;

   private int size = 0;

   public SinglyLinkedList() {}     //Default Constructor

  

   public int size() {return size; } // Accessor methods

  

   public boolean isEmpty() { return size == 0;}

  

   public Node<E> getHead() {                // Sotiris: Added getHead() you should consider whether you need set methods also

      return head;

   }

   public Node<E> getTail() {                // Sotiris: Added getTail()

      return tail;

   }

  

   public E first() {                        // Get the value of the element in the Head

      if (isEmpty())

         return null;

      return head.getElement();

   }

   public E last() {                         // Get the value of the element in the Tail

      if (isEmpty())

         return null;

      return tail.getElement();

   }       

   public void addFirst(E e){                // Create new node and added to the head

      head = new Node<>(e, head);

      if (size == 0)

         tail = head;

      size++ ;

   }

   public void addLast(E e) {                // Create new node and added to the tail

      Node<E> newest = new Node<>(e, null);

      if (isEmpty())

         head = newest;

      else

         tail.setNext(newest);

      tail = newest;

      size++;

   }

   public E removeFirst() {                 // Remove the head node, set new head

      if (isEmpty())

         return null;

      E answer = head.getElement();

      head = head.getNext();

      size--;

      if (size == 0)

         tail = null;

      return answer;

   }

   // You may need to create more methods

}
```
  

SinglyLinkedListDriver.java
```java
/*************************************************************

This driver class adds some GameEntry elements to a

SinglyLinkedList and then uses a while loop to traverse the list

and print the elements.

**************************************************************/

public class SinglyLinkedListDriver{

   public static void main(String[] args){

      SinglyLinkedList<GameEntry> highscores = new SinglyLinkedList<>();

     

     

      String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};

      int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};

  

      for (int i=0; i < names.length; i++) {

         GameEntry gE = new GameEntry(names[i], scores[i]);

         System.out.println("Adding First" + gE);

         highscores.addFirst(gE);

        

      }

           

      // Print all elements of the array

      System.out.println("Traversing the linked list:");

      SinglyLinkedList.Node<GameEntry> node = highscores.getHead();

      while (node != null){

         GameEntry gE = node.getElement();

         System.out.printf("%s -> ", node.getElement());

         node = node.getNext();

       

      }

      System.out.printf("null");  

     

   }

}
```

GameEntry.java

```java
public class GameEntry {

private String name;        // name of the person earning this score

private int score;          // the score value

/** Constructs a game entry with given parameters.. */

public GameEntry(String n, int s) {

    name = n;

    score = s;

}

/** Returns the name field. */

public String getName() { return name; }

/** Returns the score field. */

public int getScore() { return score; }

/** Returns a string representation of this entry. */

public String toString() {

    return "(" + name + ", " + score + ")";

}
```