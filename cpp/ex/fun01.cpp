// Function 01

#include <iostream>

using namespace std;

static int Result;

// Making class name China
class China {
  
  public:
  // Default function
  void Change(int x = 10, int y = 20, int z = 30 ){
    cout << x + y + z;
  }

  void Display(int x = 40, float y = 20.00) {
    Result = x % (x/3) ;
    cout << Result;
  }

};

// Making class name Box
class Box {
  int x, y;
  
  public:
  // The order of the default argument will be right to left.
  void Change(int x, int y = 50) {
    cout << x + y;
  }

};

class ChinaBox: public China, public Box {
  int x;
  float y;

  public:
  void Display(int x = 10, int xx = 100, int xxx = 1000) {
    Result = x + xx % x * x;
    cout << Result;
  }

  // Method declation
  void BoxFunction(int = 0, float = 0.00f, char = 'A'); // int("A") = 65
  void BoxFunction(float, int = 10.00, char = 'Z'); // int("Z") = 90
  void BoxFunction(char, char, char);
};

int main() {
  ChinaBox china;
  // Result = 10 % (10/3) = 10 % 3 = 1
  cout << "Question 01 >> ";
  china.China::Display(10,0.35);
  cout << "\nQuestion 02 >> ";
  china.ChinaBox::BoxFunction(10 * 1.0, int(56.00));

  return 0;
}

// Method Body
void ChinaBox::BoxFunction(float xx, int yy, char zz){
  x = zz + zz;
  y = xx + yy;
  cout << "x = " << x << endl;
}