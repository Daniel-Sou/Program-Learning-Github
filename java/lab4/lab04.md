# Lab 04 Exceptions, generic class, generic method

## Example 1

Method can throw several exceptions 

```
import java.rmi.RemoteException;
public class className
{
   public void withdraw(double amount) throws RemoteException, InsufficientFundsException 
   // InsufficientFundsException is a user-defined class 
   {
       //Method implementation
   }
   //Remainder of class definition
}

```

## Example 2 Finally

The code in finally block is always executed regardless of whether an exception occurs.

```
public class ExcepTest{
  public static void main(String args[]){
    int a[] = new int[2];
    try{
       System.out.println("Access element three :" + a[3]);
    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Exception thrown  :" + e);
    }
    finally{
       a[0] = 6;
       System.out.println("First element value: " +a[0]);
       System.out.println("The finally statement is executed");
    }
  }
}

```

## Example 3 Generics class

Generic allows method and class to be defined as inexplicit type.

```
public class Box<T> { 
	private T t; 

	public void add(T t) { 
		this.t = t; 
	} 

	public T get() { 
		return t;
 	}

	public static void main(String[] args) { 
      Box<Integer> integerBox = new Box<Integer>(); 

      Box<String> stringBox = new Box<String>();

      integerBox.add(new Integer(10)); 

      stringBox.add(new String("test"));

      System.out.printf("Int :%d\n\n", integerBox.get()); 

      System.out.printf("Char:%s\n", stringBox.get()); 
	}

}
```

## Example 4 Generics method

```
public class GenericMethodTest
 { 
	public static < E > void printArray( E[] inputArray ) 
	{
		for ( E element : inputArray )
		{ System.out.printf( "%s ", element ); } 
		System.out.println();
	 } 
	public static void main( String args[] )
	 {
		Integer[] intArray = { 1, 2, 3, 4, 5 }; 
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
 		Character[] charArray = { 'H', 'E', 'L', 'L', 'O'};
 		System.out.println("Integer Array Element:" ); 
		printArray( intArray ); 
		System.out.println( "\n Double Array Element:" ); 
		printArray( doubleArray ); 
		System.out.println("\n Char Array Element:" );
 		printArray( charArray );
	}
 }

```

## Practise - Progression
Redesign the Progression 級數 class to be abstract and generic producing a sequence of values of generic type T, and support a single constructor that accepts an initial value.

The normal Progression class
```
/** Generates a simple progression. By default: 0,1,2,3...*/
public class Progression {

// instance variable
protected long current;

/** Constructs a progression starting at zero. */
public Progression() { this(0); }

/** Constructs a progression with a given start value. */
public Progression(long start) { current = start; }

/** Returns the next value of the progression.*/
public long nextValue() {
   long answer = current;
   advance();
   return answer;
}

/** Advances the current value to the next value of the progression */
protected void advance() {
   current++;
}

/** Prints the next value of the progression, separated by spaces .*/
public void printProgression(int n) {
   System.out.print(nextValue());
   for(int j = 1; j < n;j++)
      System.out.print(" " + nextValue());
   System.out.println();
  }
}
```

Output
> Error: Main method not found in class Progression, please define the main method 		as:
	
> public static void main(String[] args)

> or a JavaFX application class must extend javafx.application.Application

Other version
```
/**
 * A class for numeric progressions.
 */
public class Progression {

    /** First value of the progression.  */
    protected long first;

    /** Current value of the progression.  */
    protected long cur;

    /** Default constructor.  */
    Progression() {
	cur = first = 0;
    }

    /** Resets the progression to the first value.
     * 
     * @return first value
     */
    protected long firstValue() {
	cur = first;
	return cur;
    }

    /** Advances the progression to the next value.
     *
     * @return next value of the progression
     */
    protected long nextValue() {
	return ++cur; // default next value
    }

    /** Prints the first n values of the progression.
     * 
     * @param n number of values to print
     */
    public void printProgression(int n) {
	System.out.print(firstValue());
	for (int i = 2; i <= n; i++) 
	    System.out.print(" " + nextValue());
	System.out.println(); // ends the line
    }
}
```

Everything else remains abstract. This can be seen by looking at the (added) method getInitial: it would return 0 for a Long, but (perhaps) "A" for a String. Also, nextValue is illuminating: it calls advance (no matter how) but advance is left to the implementation of the instantiation.
```
public abstract class Progression<T> {
    protected T current;

    public Progression() { this( getInitial()); }
    protected abstract T getInitial();
    public Progression(T start) { current = start; }

    public T nextValue() {
         T answer = current;
         advance();
         return answer;
    }

    protected abstract void advance();

    public void printProgression(int n) {
        System.out.print(nextValue());
        for(int j = 1; j < n;j++)
            System.out.print(" " + nextValue());
        System.out.println();
    }
}
```

## Exercise
1.	Use interface to find area of circle and rectangle, respectively. 
2.	Use abstract to find area of circle and rectangle, respectively. 
