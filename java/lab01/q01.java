/**
Q1. Write a short Java method, isMultiple, 
that takes two long values, n and m, 
and returns true if and only if n is a multiple of m, that is, n = m*i for some integer i.
**/

import java.io.*;

class q01 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = null;

    while(true) {
      System.out.println("Enter your value > ");
      str = br.readLine();
      System.out.println("Your value is > " + str);
      int n = Integer.parseInt(str);

      if (n == 0){
        break;
      }

      int m = 2;

      isMultiple(m,n);
    }
  }

  public static void isMultiple(int m,int n) {
    if(n%m == 0) {
      System.out.println("True"); // Output
    } else {
      System.out.println("False"); // Output
    }
  }
}