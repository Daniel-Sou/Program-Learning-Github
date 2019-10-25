#include <iostream>

using namespace std;

long GetNumber (long int Number) {
  return --Number;
}

float GetNumber(int Number) {
  return ++Number;
}

struct MyData {
  public:
  // Default parameter is from right to left
  int Addition (int a, int b = 10) {
    return a *= b + 2;
  }
  float Addition (int a, float b);
};

float Calculate(float P, int N, float R) {
  int Year = 1;
  float Sum = 1;
  Sum = Sum * (1+P * ++N * R);
  Year = (int)(Year + Sum);
  
  return Year;
}

int main() {
  int x = 20;
  long int y = 300000000;
  MyData data;
  float Calculate(float P = 5.0, int N = 2, float R = 2.0);

  cout << "Question 01 >> ";
  // y is long int; x is int
  cout << GetNumber(x) << "\t" << GetNumber(y); 

  cout << "\nQuestion 02 >> ";
  // a = a * (b + 2) = 20 * (10 + 2) = 240
  cout << data.Addition(x);

  cout << "\nQuestion 03 >> ";
  cout << Calculate() << endl;

  return 0;
}