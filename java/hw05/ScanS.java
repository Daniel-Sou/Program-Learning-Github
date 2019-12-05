
/** Assignment V
 *  
 * Suppose you have a stack S containing n elements and a queue Q that is initially empty.   
Use code fragment to describe how you can use Q to scan S to see if it contains a certain element x, with the additional constraint that your algorithm must return the elements back to S in their original order.   
You may only use S, Q, and a constant number of other primitive variables. 
 * */

import java.util.Stack;

// Queue scan
public class ScanS {
  private int arr[];
  private int front; // Front point to front element in the queue
  private int rear;
  private int capacity;
  private int count;

  // Constructor function
  ScanS(int size) {
    arr = new int[size];
    capacity = size;
    front = 0;
    rear = -1;
    count = 0;
  }

  // Remove front element from the queue
  public int dequeue() {
    // Check for queue underflow
    if (isEmpty()) {
      System.out.println("The queue is underflow\nProgram Terminated");
      System.exit(0);
    }

    System.out.println("Removing " + arr[front]);

    front = (front + 1) % capacity;
    if (count == 0) {
      return arr[front];
    } else {
      count--;
      return arr[front];
    }
  }

  // Add an item to the queue
  public void enqueue(int item) {
    // Check for queue overflow
    if (isFull()) {
      System.out.println("The queue is overflow\nProgram Terminated");
      System.exit(0);
    }

    System.out.println("Inserting " + item);

    rear = (rear + 1) % capacity;
    arr[rear] = item;
    count++;
  }

  // return front element in the queue
  public int peek() {
    if (isEmpty()) {
      System.out.println("The queue is underflow\nProgram Terminated");
      System.exit(0);
    }

    return arr[front];
  }

  // Return size of the queue
  public int size() {
    return count;
  }

  // Check if the queue is empty or not
  public Boolean isEmpty() {
    return (size() == 0);
  }

  // Check if the queue is full or not
  public Boolean isFull() {
    return (size() == capacity);
  }

  // Stack function
  static void printStack(Stack<Integer> s) {
    // If stack is empty then return
    if (s.isEmpty()) {
      return;
    }

    int x = s.peek();

    // Pop the top element of the stack
    s.pop();

    // Recursively call the function printStack
    printStack(s);

    // Print the stack element
    System.out.print(x + "\t");

    // Push the same element onto the stack to preserve the order
    s.push(x);
  }

  // scan S to see if it contains a certain element x
  public static boolean scan(Stack<Integer> s, int x) {

    System.out.println();

    // Create a queue
    ScanS q = new ScanS(s.size());

    //
    boolean found = false;

    // Check the stack data and push to queue
    while (!s.isEmpty()) {
      if (((Integer) s.peek()) == x) {
        found = true;
        System.out.println("Found the integer >> " + x + " ");
        break;
      }

      q.enqueue(s.pop());
    }

    // Return the elements back to s in their original order
    while (!q.isEmpty()) {
      for (int i = 1; i < q.size() + 1; i++) {
        q.enqueue(q.dequeue());
        s.push(q.dequeue());
        // System.out.println("The next out value is " + q.dequeue());
      }
    }

    return found;
  }

  // Main driver function
  public static void main(String[] args) {
    // Queue q = new Queue(5);

    // Stack s
    Stack<Integer> s = new Stack<Integer>();

    s.push(5);
    s.push(9);
    s.push(1);
    s.push(3);
    s.push(0);
    s.push(10);

    printStack(s);

    System.out.println(scan(s, 1));

    printStack(s);

    System.out.println(scan(s, 3));

    printStack(s);

    System.out.println(scan(s, 13));

    printStack(s);

    System.out.println();

    /**
     * printStack(s);
     * 
     * System.out.println(scan(s, 13));
     * 
     * printStack(s);
     * 
     * System.out.println(scan(s, 9));
     * 
     * printStack(s);
     * 
     * System.out.println();
     */

    /***
     * q.enqueue(1); q.enqueue(2); q.enqueue(3);
     * 
     * System.out.println("Front element is >> " + q.peek());
     * 
     * q.dequeue();
     * 
     * System.out.println("Front element is >> " + q.peek());
     * System.out.println("Queue size is >> " + q.size());
     * 
     * q.dequeue(); q.dequeue();
     * 
     * if (q.isEmpty()) { System.out.println("Queue is Empty"); } else {
     * System.out.println("Queue is not Empty"); }
     * 
     * System.out.println("\nThis is Stack >> "); s.push(1); s.push(2); s.push(3);
     * s.push(4);
     * 
     * printStack(s);
     **/
  }

  // END
}