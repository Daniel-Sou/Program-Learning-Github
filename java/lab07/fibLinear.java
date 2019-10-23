public class fibLinear {
    // Linear Recursion
  int fibLinear (int add, int sum, int n) {
    if ( n <= 2) {
      return sum;
    } else if ( n > 2) {
      return fibLinear (add, add + sum, n-1 );
    }
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for ( int i=1; i <=n; i++) {
      System.out.println(i + ": " + fibLinear(1,1,i));
    }
  }

}