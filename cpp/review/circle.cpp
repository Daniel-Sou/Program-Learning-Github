#include <iostream>
using namespace std;

class Circle {
  public:
    double radius; // The 6 radius of the circle
  
  // Make the array
  /**
  // Construct a default circle object
  Circle() {
    radius = 1;
  }

  // Construct a circle object
  Circle(double newRadius) {
    radius = newRadius;
  }
  */

    // Return the area of the circle
    
    double getArea() {
        return radius * radius * 3.14159;
    }

    // Get the radius
    void getRadius() {
        cin >> radius;
    }

    // Show the radius
  void showRadius() {
    cout << "The radius is " << radius << endl;
  }

}; // Must place a semicolon here

// Driver function
int main() {
  int number;
  int i;

  cout << "Please input number of circle >> " << endl;
  cin >> number;
  Circle C[number];

  for(i=0; i<number; i++) {
      cout << "Enter the radius " << i+1 << " >> " << endl;
      C[i].getRadius();
  }

    // Show the radius of circle
  for (i=0; i<number; i++) {
      C[i].showRadius();
  }

/**
  cout << "The area of circle radius " << circle1.radius << " is >> " << circle1.getArea() << endl;
  **/

    /**
  // Replace the radius
  double radius1 = circle1.getRadius();

  cout << "The radius replaced is >> " << radius1 << endl;
  cout << "The radius updated is >> " << circle1.getArea() << endl;
    **/

}