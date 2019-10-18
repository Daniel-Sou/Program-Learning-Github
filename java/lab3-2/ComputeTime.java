import java.lang.*;

interface Common {
  // Do the running time calculation
  double runTimer(double a, double b, double c);

  // Transportation name
  String getName();
}

class Plane implements Common {
  public double runTimer(double a, double b, double c) {
    return (a + b + c);
  }

  public String getName() {
    return ("Plane");
  }
}

class Car implements Common {
  public double runTimer(double a, double b, double c) {
    return ( a * b / c);
  }

  public String getName() {
    return ("Car");
  }
}

public class ComputeTime {
  public static void main(String args[]) {
    double A = 3;
    double B = 5;
    double C = 6;
    double v,t;

    Common d = new Car();
 
    v = d.runTimer(A,B,C);

    t = 1000 / v;

    System.out.println(d.getName() + " has average speed: " + v + " km/h");
    System.out.println(d.getName() + " speeds: " + t + " hours.");

    d = new Plane();

    v = d.runTimer(10, 30, 40);

    t = 1000 / v;

    System.out.println(d.getName() + " has average speed: " + v + " km/h");
    System.out.println(d.getName() + " speeds: " + t + " hours.");

  }
}