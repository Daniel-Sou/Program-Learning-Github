#include <iostream>

// question 03
int main() {

  int A = 12;
  A += 2;
  int B = A++;
  int C = (3 * A - 3) % B;
  int D = (B != C) && (A + B == 3 * C);
  int E = A <= B ? A : C;

  std::cout << C;

}