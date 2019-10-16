## Display the table with showpoint

Formatting Console Output


```
#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main()
{
  // Display the header of the table 
  cout << left << setw(10) << "Degrees" << setw(10) << "Radians" 
    << setw(10) << "Sine" << setw(10) << "Cosine" << setw(10) 
    << "Tangent" << endl;

  // Display values for 30 degrees
  const double PI = 3.14159;
  double degrees = 30;
  double radians = degrees * (PI / 180);
  cout << setw(10) << degrees << setw(10) << fixed 
    << setprecision(4) << radians << setw(10) << sin(radians) 
    << setw(10) << cos(radians) << setw(10) << tan(radians) << endl;

  // Display values for 60 degrees
  degrees = 60;
  radians = degrees * (PI / 180);
  cout << setw(10) << setprecision(0) << degrees << setw(10) 
    << setprecision(4) << radians << setw(10) 
    << sin(radians) << setw(10) << cos(radians) << setw(10) 
    << tan(radians) << endl;

  return 0;
}
```