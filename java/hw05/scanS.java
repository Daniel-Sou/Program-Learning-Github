import java.util.*; // Imports everything inside java.util package

public class scanS{
  // class of queue
  static class QueueObj {
    Stack<Integer> stackq;


  }

  // Function to push an item to stack
  static void push(Stack<Interger> top_ref, int new_data) {
    // Push the data onto the stack
    top_ref.push(new_data);
  }

  // Function to pop an item from stack
  static int pop(Stack<Integer> top_ref){
    // If stack is empty then error
    if(top_ref.isEmpty()) {
        System.out.println("Stack Underflow");
        System.exit(0);
    }

    // Pop the data from the stack
    return top_ref.pop();
  }

    // Recursive function to print stack
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

        // Print the stack element starting from the bottom
        System.out.print(x + "\t");

        // Push the same element onto the stack to preserve the order
        s.push(x);
    }

    // Funtion to enqueue an item to the queue
    static void enqueue(QueueObj q, int x) {
        push(q.stackq, x);
    }

    // Function to dequeue an item from the queue
    static int dequeue(QueueObj q) {
        int x;

        // If stacks are empty then error
        if(q.stackq.isEmpty()) {
            System.out.print("Q is empty");
            System.exit(0); // Exit the program
        }

        // Move elements from 
    }

    // Main function
    static boolean scan(StackObj s, int x) {
        QueueObj q = new QueueObj(s.size());
        boolean found = false; // Check the value is false
        while (!s.isEmpty()) {
            if( ((Integer)s.top()).intValue() == x){
                found = true;
                break;
            }

            q.enqueue(s.pop());
        }

        // Return the elements back to S in their original order
        while(!q.isEmpty()) {
        for(int i = 1; i < q.size(); i++) {
            q.enqueue(q.dequeue());
            s.push(q.dequeue());
        }

            return found;
        }
    }
    

  // Main method is optional - Driver Code
  public static void main(String[] args) {
    StackObj s = new StackObj(10);
    System.out.println(scan(s,3)); // Main testing
    s.printStack();
    s.push(5);
    s.push(9);
    s.push(1);
    s.push(3);
    s.push(0);
    System.out.println(scan(s,3));
    s.printStack();
    System.out.println(scan(s,13));
    s.printStack();
  }
  
}