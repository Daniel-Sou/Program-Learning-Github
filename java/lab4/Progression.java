// Generates a simple progression. By default: 0,1,2,3,...

public class Progression {

  // instance variable
  protected long current;

  /** Constructs a progression starting at zero. */
  public Progression() { 
    this(0);
  }

  /** Constructs a progression with a given start value. */
  public Progression(long start) {
    current = start;
  }

  /** Returns the next value of the progression.*/
  public long nextValue() {
    long answer = current;
    advance();
    return answer;
  }

  /** Advances the current value to the next value of the progression */
  protected void advance() {
    current ++;
  }

  /** Prints the next value of the progression, separated by spaces .*/
  public void printProgression(int n) {
    System.out.println( "The progression is " + nextValue() );

    for (int j=1; j < n; j++) {
      System.out.println(" " + nextValue());
    }

    System.out.println();
  }


}