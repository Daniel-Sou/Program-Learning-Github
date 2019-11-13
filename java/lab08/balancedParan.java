// Java program for checking 
// balanced Parenthesis 

public class balancedParan {
  static class stack {
    // Constructor function
    int top = -1;
    char items[] = new char[100];

    void push(char x) {
      if (top == 99) {
        System.out.println("Stack full");
      } else {
        items[++top] = x;
      }
    }

    char pop() {
      if (top == -1) {
        System.out.println("Underflow error");
        return '\0';
      } else {
        char element = items[top];
        top --;
        return element;
      }
    }

    boolean isEmpty() {
      return (top == -1) ? true : false;
    }
  }  

  /* Returns true if character1 and character2 
	are matching left and right Parenthesis */

  static boolean isMatchingPair(char character1, char character2) {
    if (character1 == '(' && character2 == ')') {
      return true;
    } else if (character1 == '{' && character2 == '}') {
      return true;
    } else if (character1 == '[' && character2 == ']') {
      return true;
    } else {
      return false;
    }
  }

	/* Return true if expression has balanced 
	Parenthesis */

  static boolean areParenthesisBalanced(char exp[]) {
    //
    stack st = new stack();

    //
    for (int i = 0; i < exp.length; i++) {
      //
      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
        st.push(exp[i]);
      }

      //
      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
        //
        if (st.isEmpty()) {
          return false;
        }

        //
        else if ( !isMatchingPair(st.pop(), exp[i]) ) {
          return false;
        }

      }
    }

    //
    if (st.isEmpty()) {
      return true; // Balanced
    } else {
      return false; // Not balanced
    }
  }

	/* UTILITY FUNCTIONS */
	/*driver program to test above functions*/
  public static void main(String[] args) {
    char exp[] = {'{', '(', ')', '}', '[', ']'};
    char exp1[] = {'[', '(', ']', ')'};
    char exp2[] = {'(', ']', ')'};
    char exp3[] = {'(', '[', '[', ']', '(', ')', ']', ')'};

    if (areParenthesisBalanced(exp)){
      System.out.println("Yes, Balanced.");
    } else {
      System.out.println("No, Not Balanced.");
    }

    if (areParenthesisBalanced(exp1)){
      System.out.println("Yes, Balanced.");
    } else {
      System.out.println("No, Not Balanced.");
    }

    if (areParenthesisBalanced(exp2)){
      System.out.println("Yes, Balanced.");
    } else {
      System.out.println("No, Not Balanced.");
    }

    if (areParenthesisBalanced(exp3)){
      System.out.println("Yes, Balanced.");
    } else {
      System.out.println("No, Not Balanced.");
    }
  }
}