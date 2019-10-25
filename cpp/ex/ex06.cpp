#include <iostream>

// question 06
int main() {

  int n;

  // do-while function
  do {
    std::cout << "Enter a non-negative integer: ";
    std::cin >> n;

    if (n < 0)
      std::cout << "The integer you entered is negative." << "\n";
    else
      std::cout << "Correct!!!" << "\n";
  } while ( n < 0);
}