// A class for numeric progressions

public abstract class Progression02 <T> {
  // Instance variable
  protected T current;

  protected abstract T getInitial();

  public Progression02() {
    this(T getInitial());
  }

  public Progression02(T start) {
    current = start;
  }

  public T nextValue() {
    T answer = current;
    advance();
    return answer;
  }

  protected abstract void advance();

  public void printProgression(int n) {
    System.out.println( nextValue() );

    for(int j = 1; j < n; j++) {
      System.out.println(" " + nextValue());
    }

    System.out.println();
  }
} 