// Java Program - Stack Implement with array

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStackDemo{
  public static void main(String[] args){
    ArrayStack a = new ArrayStack(5);
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    String key = "";

    while(flag) {
      System.out.println("Show >> ");
      System.out.println("Exit >> ");
      System.out.println("Push >> ");
      System.out.println("Pop >> ");
      key = sc.nextLine();

      switch (key) {
        case "show":
          a.show();
          break;
        
        case "exit":
          flag = false;
          System.out.println("The Program is exit!! ");
          break;
        
        case "push":
          System.out.println("Insert the data to stack >> ");
          int val = sc.nextInt();
          a.push(val);
        
        case "pop":
          int pop = a.pop();
          System.out.println("The value of POP out >> " + pop);
      }
    }
  }
}

class ArrayStack{
  private int MaxSize;
  private int[] arr;
  private int top = -1;
  
  public ArrayStack(int maxSize) {
    this.MaxSize = maxSize;
    arr = new int[MaxSize];
  }

  //
  public boolean isEmpty() {
    return top == -1;
  }

  public 
}