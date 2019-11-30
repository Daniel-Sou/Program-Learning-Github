// TaxInHK.cpp

# include <iostream>
using namespace std;
int main()
{
  // Prompt the user to enter taxable income
  cout << "Enter your income in Hong Kong Dollar: ";
  double incomeHKD;
  cin >> incomeHKD;

  // Compute tax
  double taxHKD = 0;
  double taxUSD = 0;
  double TaxableIncomeHKD;
    // Compute taxable for single filers
  TaxableIncomeHKD = incomeHKD - 132000;
  
    if (TaxableIncomeHKD <= 0)
      taxHKD = 0;
    else if (TaxableIncomeHKD <= 50000)
      taxHKD =  TaxableIncomeHKD * 0.02;
    else if (TaxableIncomeHKD <= 100000)
      taxHKD = 50000 * 0.02 + (TaxableIncomeHKD - 50000) * 0.06;
    else if ( TaxableIncomeHKD <= 150000)
      taxHKD = 50000 * 0.02 + 50000 * 0.06 + (TaxableIncomeHKD - 100000) * 0.1;
    else if (TaxableIncomeHKD <=200000)
      taxHKD = 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + (TaxableIncomeHKD - 150000) * 0.14;
     else
      taxHKD = 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + 50000* 0.14 + (TaxableIncomeHKD - 200000) * 0.17;

  // Display the result	

  cout << "HKD Tax is " << static_cast<double>(taxHKD * 100) / 100.0 << endl;
  cout << "Enter Exchange Rate between HKD and USD: ";
  double EXRateUSDHKD;
  cin >> EXRateUSDHKD;
  taxUSD = taxHKD/EXRateUSDHKD;
  cout << "USD Tax is " << static_cast<double>(taxUSD * 100) / 100.0 << endl;
  return 0;
}
