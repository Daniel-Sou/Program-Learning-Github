/*
Generic allows method and class to be defined as inexplicit type.
*/

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
    Box<String> string2 = new Box<String>();
    
    integerBox.add(new Integer(10));
    stringBox.add(new String("Testing String"));
    string2.add(new String("This is String 2"));

    // Formatting Numeric Print Output
    System.out.printf("Int : %d \n\n", integerBox.get());
    System.out.printf("Char : %s \nChar 2: %s \n", stringBox.get(), string2.get());
  }
}