/**
Final Review - Data Strature, Java Stack
*/

import java.util.Stack;
import java.util.*;

public class StackDemo {
  static void showpush(Stack<Integer> stack, int a) {
    stack.push(new Integer(a)); // Object pop() - push item into Stack
    System.out.println("Push (" + a + ")");
    System.out.println("Stack >> " + stack);
  }

  static void showpop(Stack<Integer> stack) {
    System.out.print("Pop >> ");
    Integer a = (Integer) stack.pop();
    System.out.println(a);
    System.out.println("Stack >> " + stack);
  }

  public static void main(String args[]) {
    Stack<Integer> stack = new Stack<Integer>();
    System.out.println("Stack >> " + stack);
    showpush(stack, 100);
    showpop(stack);
    showpush(stack, 200);
    showpush(stack, 5000);
    showpop(stack);
    showpop(stack);
    showpush(stack,100);
    showpop(stack);

    try {
      showpop(stack);
    } catch (EmptyStackException e) {
      System.out.println("EMPTY STACK !!!");
    }
  }
}