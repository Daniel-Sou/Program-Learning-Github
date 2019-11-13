# Lab 08 Stack

## Practise

### Practice2: implement with singly linked list
```java
class ListStack<T> { 
  private class Node<T>{  
    private T data;  
    private Node<T> next;  
    public Node(T t,Node<T> next){   
      this.data=t;   
      this.next=next;  
    } 
  } 
  private Node<T> top; 
  public ListStack(){  
    top=null; 
  } 

  // 向栈中添加新的结点元素: 新节点的next指向原本的top结点;将新的top结点指向新插入的节点  
  public void push(T t){  
    Node<T> node=new Node<T>(t,top);  
    top=node; } 

   // 栈顶出栈并将新栈顶结点指向原栈顶结点  
  public T pop() throws Exception{  
    if(top==null){   
      throw new Exception("栈为空，元素不可出栈");  
    }  
    Node<T> node=top;  
    top=top.next;  
    return node.data;
  } 

     //遍历打印栈    
   public void printfStack(){  
       Node<T> node=top;  
       while(node!=null){   
         System.out.println(node.data);   
         node=node.next;  
       } 
    } 
         
   public static void main(String[] args) throws Exception {  
       ListStack<String> list=new ListStack<String>();  
       list.push("1");  
       list.push("2");  
       list.push("3");  
       list.pop();        
       list.printfStack(); 
    }
} 

```

### Practice3: implement with array
```java
import java.util.Arrays;
import java.util.Scanner;

class ArrayStackDemo {
  public static void main(String[] args) {
    ArrayStack a = new ArrayStack(5);
    boolean flag = true;// 用于判断循环结束的标志
    Scanner sc = new Scanner(System.in);
    String key = "";// 用于接受菜单的选项
    while (flag) {
      System.out.println("show：显示栈");
      System.out.println("exit：退出程序");
      System.out.println("push：进栈");
      System.out.println("pop：出栈");
      key = sc.nextLine();
      switch (key) {
      case "show":
      a.show();
      break;
      case "exit":
      flag = false;
      System.out.println("程序结束！");
      break;

      case "push": 
      System.out.println("请输入要进栈的数据：");
      int val = sc.nextInt();
      a.push(val);

      break;
      case "pop":
      int pop = a.pop();
      System.out.println("出栈的值是：" + pop);
      }
    }  
  }  
 }
 
```

```java
class ArrayStack {
 private int MaxSize;// 定义数组的最大长度
 private int[] arr;// 定义数组，数据就放在该数组
 private int top = -1;// 定义栈顶，初始化数据为-1
  
 public ArrayStack(int maxSize) {
 this.MaxSize = maxSize;
 arr = new int[MaxSize];
 }
  
 // 判断数组是否为空
 public boolean isEmpty() {
 return top == -1;
 }
  
 // 判断数组是否满了
 public boolean isFull() {
 System.out.println("栈顶：" + top + "最大长度：" + MaxSize);
 return top == MaxSize -1;
 }
  
 // 进栈
 public void push(int val) {
 // 先判断栈是否满了，满了就不能添加进去
 if (isFull()) {
 System.out.println("栈已经满了~~");
 return;
 }
 top++;
 arr[top] = val;
 }
  
 // 出栈
 public int pop() {
 // 先判断栈是否为空
 if (isEmpty()) {
 throw new RuntimeException("栈为空，无法出栈！");
 }
 int val = arr[top];
 top--;
 return val;
 }
  
 public void show() {
 if (isEmpty()) {
 System.out.println("没有数据");
 return;
 }
 for (int i = top; i >= 0; i--) {
 System.out.print(arr[i] + "\t");
 }
 System.out.println();
 } 
}

```

### Testing code
```java
Stack<Integer> S = new ArrayStack<>();
S.push(5);
S.push(3);
System.out.println(S.size());

```

## Exercise
Implement parentheses 括號 matching using stack

### Reference
Check for balanced parentheses in an expression
https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/

Input:

Inputs are only    [  ,  ]  ,  ( ,  )  ,   [  and ] are a pair ,  ( and ) are a pair.

---

Output:
	
If the inputs bracket are all paired, output yes, 
if not, output No

Example: (Stacks and Queues, Slide 20)
Input
	[(]) 
	(]) 
	([[]()])
output
	No
	No
	Yes

Reference Code
```java
// Java program for checking 
// balanced Parenthesis 

public class BalancedParan 
{ 
	static class stack 
	{ 
		int top=-1; 
		char items[] = new char[100]; 

		void push(char x) 
		{ 
			if (top == 99) 
			{ 
				System.out.println("Stack full"); 
			} 
			else
			{ 
				items[++top] = x; 
			} 
		} 

		char pop() 
		{ 
			if (top == -1) 
			{ 
				System.out.println("Underflow error"); 
				return '\0'; 
			} 
			else
			{ 
				char element = items[top]; 
				top--; 
				return element; 
			} 
		} 

		boolean isEmpty() 
		{ 
			return (top == -1) ? true : false; 
		} 
	} 
	
	/* Returns true if character1 and character2 
	are matching left and right Parenthesis */
	static boolean isMatchingPair(char character1, char character2) 
	{ 
	if (character1 == '(' && character2 == ')') 
		return true; 
	else if (character1 == '{' && character2 == '}') 
		return true; 
	else if (character1 == '[' && character2 == ']') 
		return true; 
	else
		return false; 
	} 
	
	/* Return true if expression has balanced 
	Parenthesis */
	static boolean areParenthesisBalanced(char exp[]) 
	{ 
	/* Declare an empty character stack */
	stack st=new stack(); 
	
	/* Traverse the given expression to 
		check matching parenthesis */
	for(int i=0;i<exp.length;i++) 
	{ 
			
		/*If the exp[i] is a starting 
			parenthesis then push it*/
		if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
			st.push(exp[i]); 
	
		/* If exp[i] is an ending parenthesis 
			then pop from stack and check if the 
			popped parenthesis is a matching pair*/
		if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
		{ 
				
			/* If we see an ending parenthesis without 
				a pair then return false*/
			if (st.isEmpty()) 
			{ 
				return false; 
			} 
	
			/* Pop the top element from stack, if 
				it is not a pair parenthesis of character 
				then there is a mismatch. This happens for 
				expressions like {(}) */
			else if ( !isMatchingPair(st.pop(), exp[i]) ) 
			{ 
				return false; 
			} 
		} 
			
	} 
		
	/* If there is something left in expression 
		then there is a starting parenthesis without 
		a closing parenthesis */
		
	if (st.isEmpty()) 
		return true; /*balanced*/
	else
		{ /*not balanced*/
			return false; 
		} 
	} 
	
	/* UTILITY FUNCTIONS */
	/*driver program to test above functions*/
	public static void main(String[] args) 
	{ 
		char exp[] = {'{','(',')','}','[',']'}; 
		if (areParenthesisBalanced(exp)) 
			System.out.println("Balanced "); 
		else
			System.out.println("Not Balanced "); 
	} 

} 

```