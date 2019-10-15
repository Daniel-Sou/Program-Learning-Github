/*
Use interface to find area of circle and rectangle, respectively.
*/

interface area {
  double pi = 3.14;
  double cal(double x, double y);
}

// Calculate the area of rectangle via interface
class rect implements area {
  public double cal(double x, double y) {
    return (x * y);
  }
}

// Calculate the area of cicle via interface
class circ implements area {
  public double cal(double x, double y) {
    return (pi * x * x);
  }
}

class intArea {
  public static void main(String args[]) {
    rect r = new rect();
    circ c = new circ();
    area a1, a2;

    a1 = r;
    System.out.println("\nArea of Rectangle is > " + a1.cal(10,10));

    a2 = c;
    System.out.println("\nArea of Circle is > " + a2.cal(20,20));
  }
}
