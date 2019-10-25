/*
Simple File Output 
*/

#include <iostream> // Input, Output
#include <fstream> // File system

using namespace std;

int num1, num2, num3;

void input_number() {
  cout << "Please input the number 1 >> ";
  cin >> num1;
  cout << "Please input the number 2 >> ";
  cin >> num2;
  cout << "Please input the number 3 >> ";
  cin >> num3;
}


int main() {
  ofstream output;

  input_number();

  // Create a file
  output.open("number.csv");

  // Write numbers
  output << num1 << "  " << num2 << "  " << num3;

  // Close file
  output.close();

  cout << "Done" << endl;

  return 0; 
}