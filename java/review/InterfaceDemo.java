
/**
 * Lab 04
 * 
 * Exercise: Use interface to find area of circle and rectangle, respectively.
 * Use abstract to find area of circle and rectangle, respectively.
 * 
 * Concept:
 * - Interface
 * - Abstract
 */

import java.util.*;

import javafx.scene.shape.Rectangle;

class InterfaceDemo {
    public static void main(String[] args) {

        // Input the radius of the circle
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the radius >> ");
        double r;
        r = scan.nextInt();

        // Length
        Scanner x = new Scanner(System.in);
        System.out.print("Please input the length of the rectangle >> ");
        double a;
        a = x.nextInt();

        // Width
        Scanner y = new Scanner(System.in);
        System.out.print("Please input the width of the rectangle >> ");
        double b;
        b = y.nextInt();

        Circle Circle1 = new Circle(r);
        Rectangle rectangle1 = new Rectangle(a, b);
        Circle1.area();
        rectangle1.area();
    }
}

abstract class ShapeArea {
    abstract void area();
}

class Circle extends ShapeArea {
    double PI = 3.14;

    double radius;

    public Circle(double r) {
        radius = r;
    }

    public void area() {
        double s1 = radius * radius * PI;
        System.out.println("The area of circle is " + s1);
    }
}

class Rectangle extends ShapeArea {
    // Fields
    double height;
    double weight;

    // Constructors
    public Rectangle(double a, double b) {
        height = a;
        weight = b;
    }

    // Method
    public void area() {
        double s2 = weight * height;
        System.out.println("The area of the rectangle is " + s2);
    }
}