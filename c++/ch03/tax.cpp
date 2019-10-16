#include <iostream>

using namespace std;

int main() {
  // Prompt the user to enter taxable income
  cout << "Enter the taxable income > ";
  double income;
  cin >> income;

  // Compute tax
  double tax = 0;
  double tax1 = 9525 * 0.10 // tax 1 is 10% base
  double tax2 = (38700 - 9525) * 0.12 // tax 2 is 12% base

  // Compute tax for single filers
  if (income <= 9525)
    tax = income * 0.10; // 10% income tax
  else if (income <= 38700)
    tax = tax1 + (income - 9825) * 0.12;
  else if (income <= 82500)
    tax = tax1 + tax2 + (income - 38700) * 0.22;
  else if (income <= 157500)
    tax
}