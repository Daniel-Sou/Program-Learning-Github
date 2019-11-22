/*
 * A Java program to evaluate a given expression where tokens are separated by
 * space. 
 * 
 * Test Cases: 
 * "10 + 2 * 6" ---> 22 
 * "100 * 2 + 12" ---> 212
 * "100 * ( 2 + 12 )" ---> 1400 
 * "100 * ( 2 + 12 ) / 14" ---> 100
 */

import java.util.Stack;

public class EvaluateString {
    public static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        Stack<Integer> values = new Stack<Integer>();

        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') {
                continue;
            }

            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    sbuf.append(tokens[i++]);
                }

                values.push(Integer.parseInt(sbuf.toString()));
            }

            //
            else if (tokens[i] == '(') {
                ops.push(tokens[i]);
            }

            //
            else if (tokens[i] == ')') {
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }

                ops.pop();
            }

            //
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                //
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }

                //
                ops.push(tokens[i]);
            }
        }

        //
        while (!ops.empty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        //
        return values.pop();
    }

    //
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }

        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    //
    public static int applyOp(char op, int b, int a) {
        switch (op) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0) {
                throw new UnsupportedOperationException("Cannot divide by zero");
            }
            return a / b;
        }

        return 0;
    }

    //
    public static void main(String[] args) {
        System.out.println(EvaluateString.evaluate("10 + 2 * 6"));

        System.out.println(EvaluateString.evaluate("100 * 2 + 12"));

        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )"));

        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14"));

        System.out.println(EvaluateString.evaluate("100 * ( 2 + 120 ) / ( 30 + 2 ) "));
    }
}