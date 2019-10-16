/* 
The Circle class (All source codes in one file) (CircleAIO.cpp) */

#include <iostream> // using IO functions
#include <string> // using string
using namespace std;

// Create the class Circle
class Circle {
  private:
    // Data member (Variable)
    double radius;
    string color;

  public:
    // Constructor with default values for data members
    Circle(double r = 1.0, string c = "red") {
      radius = r;
      color = c;
    }

    // Member function (Getter)
    double getRadius() {
      return radius;
    }

    // Member function (Getter)
    string getColor() {
      return color;
    }

    // Member function
    double getArea() {
      double pi = 3.1416;
      return radius * radius * pi;
    }
}; 
// Need to end the class declaration with a semi-colon

// Test driver function
int main() {
  // Construct a Circle instance
  Circle c1(1.2, "blue");

  cout << "Radius = " << c1.getRadius() << "; Area = " << c1.getArea() << "; Color = " << c1.getColor() << endl;

  return 0;
}