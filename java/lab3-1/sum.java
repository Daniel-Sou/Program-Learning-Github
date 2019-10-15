/**
Write a short Java method that takes an integer n and returns the sum of all positive integers less than or equal to n.
**/

import java.io.*; //Import the input method

public class sum{
  public static void main(String args[]) throws IOException {
    // Set the input class
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = null;

    while(true) {
      System.out.println("Enter your value > ");
      str = br.readLine();
      System.out.println("Your value is > " + str);
      int n = Integer.parseInt(str);

      if (n == 0)
        break;
      
      // Use the package
      add(n);

      break; // Exit the while loop
    }
  }

  // The package add()
  public static void add(int m) {
    int sum = 0;

    // Sum of all positive integers less than or equal to n
    for (int i = 0; i <= m; i++) {
      sum += i; 
    }

    System.out.println("Sum = " + sum); // Output
  }
}