# LAB 10 Tree Structure

## Objectives
- Get familiar with tree and binary tree

- Get familiar with three binary tree traversal approaches: preorder, inorder, postorder

![image](https://i.loli.net/2019/11/27/j2HPJQDegfNb4tm.png)

Evaluating the expression represented by expression tree:
```
Let t be the expression tree
If  t is not null then
      If t.value is operand then  
                Return  t.value
      A = solve(t.left)
      B = solve(t.right)
 
      // calculate applies operator 't.value' 
      // on A and B, and returns value
      Return calculate(A, B, t.value)   
```

## Practice
Build the binary tree representation of the following arithmetic expression
```
(((5+2) * (2-1)) / ((2+9) + ((7-2) -1)) * 8)
```

```java
// ExpressionTree.java
// Java program to construct an expression tree 

import java.util.Stack; 

// Java program for expression tree 
class Node { 

	char value; 
	Node left, right; 

	Node(char item) { 
		value = item; 
		left = right = null; 
	} 
} 

public class ExpressionTree { 

	// A utility function to check if 'c' 
	// is an operator 

	boolean isOperator(char c) { 
		if (c == '+' || c == '-'
				|| c == '*' || c == '/'
				|| c == '^') { 
			return true; 
		} 
		return false; 
	} 

	// Utility function to do inorder traversal 
	void inorder(Node t) { 
		if (t != null) { 
			inorder(t.left); 
			System.out.print(t.value + " "); 
			inorder(t.right); 
		} 
	} 

	// Returns root of constructed tree for given 
	// postfix expression 
	Node constructTree(char postfix[]) { 
		Stack<Node> st = new Stack(); 
		Node t, t1, t2; 

		// Traverse through every character of 
		// input expression 
		for (int i = 0; i < postfix.length; i++) { 

			// If operand, simply push into stack 
			if (!isOperator(postfix[i])) { 
				t = new Node(postfix[i]); 
				st.push(t); 
			} else // operator 
			{ 
				t = new Node(postfix[i]); 

				// Pop two top nodes 
				// Store top 
				t1 = st.pop();	 // Remove top 
				t2 = st.pop(); 

				// make them children 
				t.right = t1; 
				t.left = t2; 

				// System.out.println(t1 + "" + t2); 
				// Add this subexpression to stack 
				st.push(t); 
			} 
		} 

		// only element will be root of expression 
		// tree 
		t = st.peek(); 
		st.pop(); 

		return t; 
	} 

	public static void main(String args[]) { 

		ExpressionTree et = new ExpressionTree(); 
		String postfix = "ab+ef*g*-"; 
		char[] charArray = postfix.toCharArray(); 
		Node root = et.constructTree(charArray); 
		System.out.println("infix expression is"); 
		et.inorder(root); 

	} 
} 

// This code has been contributed by Mayank Jaiswal 

```


## Exercise
Using inorder to print out the arithmetic expressions in binary tree.

Code for different tree traversals
```java
// BinaryTree.java
// Java program for different tree traversals 

/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

public class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root; 

	BinaryTree() 
	{ 
		root = null; 
	} 

	/* Given a binary tree, print its nodes according to the 
	"bottom-up" postorder traversal. */
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.key + " "); 
	} 

	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first recur on left child */
		printInorder(node.left); 

		/* then print the data of node */
		System.out.print(node.key + " "); 

		/* now recur on right child */
		printInorder(node.right); 
	} 

	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.key + " "); 

		/* then recur on left sutree */
		printPreorder(node.left); 

		/* now recur on right subtree */
		printPreorder(node.right); 
	} 

	// Wrappers over above recursive functions 
	void printPostorder() {	 printPostorder(root); } 
	void printInorder() {	 printInorder(root); } 
	void printPreorder() {	 printPreorder(root); } 

	// Driver method 
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 

		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(); 

		System.out.println("\nInorder traversal of binary tree is "); 
		tree.printInorder(); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
	} 
} 

```

Remark:

Inorder traversal of expression tree produces infix version of given postfix expression (same with preorder traversal it gives prefix expression)

## Reference
[Expression Tree](https://www.geeksforgeeks.org/expression-tree/)

## [Submission Guideline] 
Please submit .java file to UMMoodle.

Do not copy your classmate’s codes, otherwise both of you will lose scores.

Submission deadline: 11:50 p.m., 27/11/2019. 

(It will be better if you can submit
at the end of this lab.)
