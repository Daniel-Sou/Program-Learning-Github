public class DynamicStack {
  int capacity = 2;
  int stack[] = new int[capacity];
  int top = 0;

  public void push(int data) {
      if(size() == capacity) {
        expand();
      }

      stack[top] = data;
      top ++;
  }

  // Imprement the Dynamic Array to Array Stack
  private void expand() {
    int length = size();
    int newStack[] = new int[capacity * 2];

    // Important >> Arraycopy
    System.arraycopy(stack, 0, newStack, 0, length);
    stack = newStack;
    capacity *= 2;
  }

  public int pop() {
    int data = 0;

    if( isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      top --;
      data = stack[top];
      stack[top] = 0;
      shrink();
    }

    return data;
  }

  private void shrink() {
    int length = size();
    if (length <= (capacity / 2) / 2) {
      capacity = capacity / 2;
    }

    int newStack[] = new int[capacity];
    System.arraycopy(stack, 0, newStack, 0, length);
    stack = newStack;
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
    DynamicStack nums = new DynamicStack();

    nums.push(15);
    nums.show();
    nums.push(8);
    nums.show();
    nums.push(10);
    nums.show();
    nums.push(10);
    nums.show();
    nums.push(10);
    nums.show();

    System.out.println();
    
    System.out.println("The 1st number pop out is " + nums.pop());
    System.out.println("The 2nd number pop out is " + nums.pop());
    System.out.println("The 3rd number pop out is " + nums.pop());
    System.out.println("The size is " + nums.size());
    System.out.println("The 4th number pop out is " + nums.pop());

  }

}

