import java.util.*;

class Stack {
  private int arr[];
  private int front; // Front point to front element in the queue
  private int rear;
  private int capacity;
  private int count;

  Stack(int size) {
    arr = new int[size];
    capacity = size;
    front = 0; 
    rear = -1;
    count = 0;
  }
}

public class Queue {
  private int arr[];
  private int front; // Front point to front element in the queue
  private int rear;
  private int capacity;
  private int count;

  // Constructor function
  Queue(int size) {
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
    count--;

    return arr[front];
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
  static void printStack(Stack s) {
    // If stack is empty then return
    if(s.isEmpty()){
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
  public static boolean scan(Stack s, int x){
    // Create a queue
    Queue q = new Queue(s.size());

    //
    boolean found = false;

    //
    while (!s.isEmpty()) {
      if(((Integer)s.peek()) == x) {
        found = true;
        break;
      }
      q.enqueue(s.pop());
    }

    // Return the elements back to s in their original order
    while (!q.isEmpty()){
      for(int i =1; i < q.size(); i++) {
        q.enqueue(q.dequeue());
        s.push(q.dequeue());
      }
    }
    
    return found;
  }


  // Main driver function
  public static void main(String[] args) {
    // Create a queue of capacity of 5
    // Queue q = new Queue(5);

    // Stack s
    Stack s = new Stack(10);

    System.out.println(scan(s,3));

    printStack(s);

    s.push(5);
    s.push(9);
    s.push(1);
    s.push(3);
    s.push(0);
    
    System.out.println(scan(s, 3));

    printStack(s);

    System.out.println(scan(s,13));

    printStack(s);


    /***
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);

    System.out.println("Front element is >> " + q.peek());

    q.dequeue();
    
    System.out.println("Front element is >> " + q.peek());
    System.out.println("Queue size is >> " + q.size());

    q.dequeue();
    q.dequeue();

    if (q.isEmpty()) {
      System.out.println("Queue is Empty");
    } else {
      System.out.println("Queue is not Empty");
    }

    System.out.println("\nThis is Stack >> ");
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    printStack(s);
    **/
  }

  // END
}