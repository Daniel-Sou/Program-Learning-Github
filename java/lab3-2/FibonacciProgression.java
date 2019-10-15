/*
Develop FibonacciProgression subclass that inherits Progression class in Lecture Note Object Oriented Programming slide no.23.
*/

class Progression {
  protected long current;

  // Construct a progression starting at zero
  public Progression() {
    this(0);
  }

  // Constructs a progression with given start value
  public Progression(long start) {
    current = start;
  }

  // 
}

public class FibonacciProgression extends Progression {
  protected long prev;

  // Construct
  public FibonacciProgression() {
    this(0,1);
  }

  public FibonaciProgression(long first, long second) {
    super(first);

    // Fictitious value preceding the first
    prev = second - first;
  }
}