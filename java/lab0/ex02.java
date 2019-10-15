// This is exercise 02, starting a new method

public class ex02 {
  public static void main(String[] args) {
    print();
  }

  //Start a new method
  public static void print() {
    int x = 10;
    int y = 25;
    int sum = x + y;

    System.out.println("Sum of x + y = " + sum);
  }

  /**

  // Start if static is removed
  public void print() {
    int x = 20;
    int y = 30;

    int sum2 = x + y;

    System.out.println("Sum of x + y = " + sum2);
  }

    Result:
    javac ex02.java
    ex02.java:5: error: non-static method print() cannot be referenced from a static context
    print();
    ^
    1 error
    ***/

  }