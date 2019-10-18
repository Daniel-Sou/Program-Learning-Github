// EX04. Java input - Scanner

import java.util.*;

public class ex04_01 {
  public static void main(String[] args) {
    // Scanner class of float and int
    Scanner in = new Scanner(System.in); 

    // The float data 
    System.out.println("Please input a float number > ");
    float num = in.nextFloat(); // Input float data
    System.out.println("The float number is > " + num);
  
    // The int data
    System.out.println("Please input a int number > ");
    int num2 = in.nextInt(); // Input int data
    System.out.println("The int number is > " + num2);

    // The string data, not space in the middle
    System.out.println("please input a string > ");
    Scanner str = new Scanner(System.in);
    System.out.println("The string is > " + str.next());
  }
}