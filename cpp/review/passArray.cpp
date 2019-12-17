// Effect of Pass Array

#include <iostream>
using namespace std;

void m(int number, int numbers[]){
  number = 2001;
  numbers[0] = 5555;
}

int main() {
  int x = 10; // x have problem if x do not add any value
  int y[10];
  int z[20];
  y[0] = 1;

  m(x,z);

  cout << "x is >> " << x << endl;
  cout << "y[0] is >> " << y[0] << endl;
  cout << "z[0] is >> " << z[0] << endl;

  return 0;
}
