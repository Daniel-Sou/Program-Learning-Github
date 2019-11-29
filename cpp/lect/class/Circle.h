/* The Circle class Header (Circle.h) */

// using string
#include <string>
using namespace std;

// Circle class declaration
class Circle
{
    // Accessible by members of this class only
private:
    // private data members (variables)
    double radius;
    string color;

    // Accessible by ALL
public:
    // Declare prototype of member functions
    // Constructor with default values
    Circle(double radius = 1.0, string color = "red");

    // Public getters & setters for private data members
    double getRadius() const;
    void setRadius(double radius);
    string getColor() const;
    void setColor(string color);

    // Public member Function
    double getArea() const;
};
