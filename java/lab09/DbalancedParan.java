// Lab 09 Stacks
// Java program for checking 
// balanced Parenthesis using Dynamic Stack

public class DbalancedParan {
  static class stack {
    // Constructor function
    int capacity = 2;
    char items[] = new char[capacity];
    int top = 0;

    public int size() {
      return top;
    }

    void push(char x) {
      if (size() >= capacity) {
        expand();
      }
      
      items[top] = x;
      top ++;
    }

    // Imprement the Dynamic Array to Array Stack
  private void expand() {
    int length = size();
    char newStack[] = new char[capacity * 2];

    // Important >> Arraycopy
    System.arraycopy(items, 0, newStack, 0, length);
    items = newStack;
    capacity *= 2;
  }

    char pop() {
      if (top == 0) {
        System.out.println("Underflow error");
        return '\0';
      } else {
        char element = items[top];
        top --;
        shrink();

        return element;
      }
    }

    private void shrink() {
      int length = size();
      if (length <= (capacity / 2) / 2) {
        capacity = capacity / 2;
      }

      char newStack[] = new char[capacity];
      System.arraycopy(items, 0, newStack, 0, length);
      items = newStack;
    }

    boolean isEmpty() {
      return (top == 0) ? true : false;
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
  	/* Declare an empty character stack */
    stack st = new stack();

	  /* Traverse the given expression to 
		check matching parenthesis */
    for (int i = 0; i < exp.length; i++) {
		  
      /*If the exp[i] is a starting 
			parenthesis then push it*/
      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
        st.push(exp[i]);
      }

	  	/* If exp[i] is an ending parenthesis 
			then pop from stack and check if the 
			popped parenthesis is a matching pair*/
      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

			  /* If we see an ending parenthesis without 
				a pair then return false*/
        if (st.isEmpty()) {
          return false;
        }

		  	/* Pop the top element from stack, if 
				it is not a pair parenthesis of character 
				then there is a mismatch. This happens for 
				expressions like {(}) */
        else if ( !isMatchingPair(st.pop(), exp[i]) ) {
          return false;
        }

      }
    }

	  /* If there is something left in expression 
		then there is a starting parenthesis without 
		a closing parenthesis */

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