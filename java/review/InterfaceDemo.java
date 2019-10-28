
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
        Rectangle rectangle1 = new 

    }
}