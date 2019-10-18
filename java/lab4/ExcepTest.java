/*
輸出異常
The code in finally block is always executed regardless of whether an exception occurs.
*/

public class ExcepTest {
  public static void main(String args[]) {
    int a[] = new int[2];

    try {
      System.out.println("Access element three : " + a[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception thrown : \n" + e);
    }
    finally{
      a[0] = 6;
      System.out.println("\nFirst element value: " + a[0]);
      System.out.println("The finally statement is executed.");
    }
  }
}