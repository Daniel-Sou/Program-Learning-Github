// EX03. Start a different class

public class ex03 {
  public static void main(String [] args) {
    NewClass A;
    A = new NewClass();
    System.out.println(A.a);
  }

  // This class is inside the class ex03
  // Constructor
  public static class NewClass {
    int a;
    public NewClass() {
      a = 1;
    }
  }
}