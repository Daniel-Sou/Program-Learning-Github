#include <iostream>
#include "MyMathFunctions.h"

using namespace std;

int main() {
  int radius = getPosInt("Enter a positive integer >> ");
  double aCircle = areaOfCircle(radius);

  cout << "The area of a circle of radius " << radius << " is " << aCircle << endl;

  return 0;
}
