// ClassHeader.h
#include <iostream>

using namespace std;

/**
ClassHeader.h

class Circle {
  public:
    double radius;

  Circle();

  Circle(double);

  double getArea();
}

**/

// classBuild.cpp
class Circle {
  public:
    double radius;

  // Default circle object
  Circle() {
    radius = 1;
  }

  // Construct a new circle object
  Circle(double newRadius) {
    radius = newRadius;
  }

  // Behavior
  double getArea() {
    return radius * radius * 3.14159;
  }
};

// classDriver.cpp
int main() {
  Circle circle1(5.0);
  cout << "The area of circle of Radius >> " << circle1.radius << "; The area >> " << circle1.getArea() << endl;

  return 0;
}