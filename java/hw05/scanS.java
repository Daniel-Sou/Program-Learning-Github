import java.util.*; // Imports everything inside java.util package

public class scanS{
  public static boolean scan(StackObj s, int x) {
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

  // Main method is optional
  public static void main(String[] args) {
    StackObj s = new StackObj(10);
    System.out.println(scan(s,3));
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