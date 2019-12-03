public class scanS{
  public static boolean scan(StackObj s, int x) {
    QueueObj q = new QueueObj(s.size());
    boolean found = false; // Check the value is false
    while (!s.isEmpty()) {
      if( (Integer)s.top()).intValue() == x){
        found = true;
        break;
      }

      q.enqueue(s.pop());
    }

    // Return the elements back to S in their original order
  }
  
}