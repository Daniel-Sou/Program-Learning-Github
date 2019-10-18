/*
Java Program to calculate Area using Abstract Class and Methods
Use abstract to find area of circle and rectangle, respectively
*/

import java.util.Scanner;

abstract class calcArea {
  public abstract void findRectangle(double a1, double a2);
  public abstract void findCircle(double r);
}

class findArea extends calcArea {
  // Area = a1 * a2
  public void findRectangle(double a1, double a2) {
    double area = a1 * a2;
    System.out.println("\nArea of Rectangle > " + area);
  }

  // Area = pi * r * r
  public void findCircle(double r) {
    double pi = 3.14;

    double area = pi * r * r;

    System.out.println("\nArea of Circle > " + area);
  }
}

public class absArea {
  public static void main(String args[]) {
    double a1, a2, r;
    findArea area = new findArea();
    Scanner get = new Scanner(System.in);

    System.out.println("\nEnter Length and Breadth of Rectangle > ");
    a1 = get.nextDouble(); // a1 = Length of Rectangle
    a2 = get.nextDouble(); // a2 = Breadth of Rectangle
    area.findRectangle(a1,a2);

    System.out.println("\nEnter Radius of Circle > ");
    r = get.nextDouble();
    area.findCircle(r);
  }
}