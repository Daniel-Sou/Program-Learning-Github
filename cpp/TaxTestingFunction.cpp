
#include <iostream>
using namespace std;

double CalHKTax(double incomeHKD)
{
  double taxHKD;
    // Compute taxable for single filers
  incomeHKD = incomeHKD - 132000;
    if (incomeHKD <= 0)
      taxHKD = 0;
    else if (incomeHKD <= 50000)
      taxHKD =  incomeHKD * 0.02;
    else if (incomeHKD <= 100000)
      taxHKD = 50000 * 0.02 + (incomeHKD - 50000) * 0.06;
    else if ( incomeHKD <= 150000)
      taxHKD = 50000 * 0.02 + 50000 * 0.06 + (incomeHKD - 100000) * 0.1;
    else if (incomeHKD <=200000)
      taxHKD = 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + (incomeHKD - 150000) * 0.14;
     else
      taxHKD = 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + 50000* 0.14 + (incomeHKD - 200000) * 0.17;
   return taxHKD;
}
double CalUSATax(double incomeUSD)
{
    double taxUSDinUSA;
    // Compute tax for single filers
    if (incomeUSD <= 9525)
      taxUSDinUSA = incomeUSD * 0.10;
    else if (incomeUSD <= 38700)
      taxUSDinUSA = 9525 * 0.10 + (incomeUSD - 9525) * 0.12;
    else if (incomeUSD  <= 82500)
      taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (incomeUSD - 38700) * 0.22;
    else if (incomeUSD <=157500)
            taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (incomeUSD - 82500) * 0.24;
    else if (incomeUSD <= 200000)
            taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (157000 - 82500) * 0.24
+ (incomeUSD - 157500) * 0.32;
    else if (incomeUSD <= 500000)
            taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (157000 - 82500) * 0.24
+ (200000 - 157500) * 0.32 + (incomeUSD - 200000) * 0.35  ;
         else
            taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (157000 - 82500) * 0.24
+ (200000 - 157500) * 0.32 + (500000 - 200000) * 0.35 + (incomeUSD-500000) *0.37 ;
    return taxUSDinUSA;
}

int main()
{
  // Prompt the user to enter taxable income
  cout << "Enter your income in Hong Kong Dollar: ";
  double incomeHKD;
  cin >> incomeHKD;
  cout << "Enter Exchange Rate between USD and HKD: ";
  double USDHKDExchangeRate;
  cin >> USDHKDExchangeRate;
  double incomeUSD;
  double taxHKD;
  double taxUSDinHK;
  double taxUSDinUSA;

  incomeUSD = incomeHKD/USDHKDExchangeRate;
  // Compute tax
  taxHKD = CalHKTax(incomeHKD);
  // Display the result
  taxUSDinHK = taxHKD/USDHKDExchangeRate;
  cout << "HKD Tax in Hong Kong is " << static_cast<int>(taxHKD * 100) / 100.0 << endl;
  cout << "USD Tax in Hong Kong is " << static_cast<int>(taxUSDinHK * 100) / 100.0 << endl;

  taxUSDinUSA = CalUSATax(incomeUSD);
  cout << "Tax in USA is " << static_cast<int>( taxUSDinUSA * 100) / 100.0 << endl;
  double GlobalTax;

  GlobalTax = taxUSDinUSA - taxUSDinHK;

  if (GlobalTax <= 0.0)
  {
    cout << "you do not need to pay global tax" << endl;
  }
  else
    cout << "Your Global Tax is:" << GlobalTax <<"Dollars" << endl;

  return 0;
}


