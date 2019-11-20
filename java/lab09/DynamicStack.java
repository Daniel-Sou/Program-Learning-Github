public class DynamicStack {
  int capacity = 2;
  int stack[] = new int[capacity];
  int top = 0;

  public void push(int data) {
    if (top == 5) {
      System.out.println("Stack is full");      
    } else {
      stack[top] = data;
      top ++;
    }
  }

  public int pop() {
    int data = 0;

    if( isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      top --;
      data = stack[top];
      stack[top] = 0;
    }

    return data;
  }

  public int peek() {
    int data;
    data = stack[top-1];
    
    return data;
  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return top <= 0;
  }

  public void show() {
    for (int n:stack) {
      System.out.print(n + "\t");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Stack nums = new Stack();

    nums.push(15);
    nums.show();
    nums.push(8);
    nums.show();
    nums.push(10);
    nums.show();

    System.out.println();
    
    System.out.println(nums.pop());
    System.out.println(nums.pop());
    System.out.println(nums.pop());
    System.out.println(nums.size());
    System.out.println(nums.pop());

  }

}

