// TaxInHK.cpp

# include <iostream>

using namespace std;
int main()
{
  // Prompt the user to enter taxable income
  cout << "Enter your annual income in Macau Dollar >> ";
  double incomeMOP;
  cin >> incomeMOP;

  // Compute tax
  double taxMOP = 0;
  double taxUSD = 0;
  double TaxableIncomeMOP;
    // Compute taxable for single filers
  TaxableIncomeMOP = incomeMOP - 144000;
  
    if (TaxableIncomeMOP <= 0)
      taxMOP = 0;
    else if (TaxableIncomeMOP <= 164000)
      taxMOP =  TaxableIncomeMOP * 0.07;
    else if (TaxableIncomeMOP <= 184000)
      taxMOP =  TaxableIncomeMOP * 0.08;
    else if ( TaxableIncomeMOP <= 224000)
      taxMOP =  TaxableIncomeMOP * 0.09;
    else if (TaxableIncomeMOP <= 304000)
      taxMOP = TaxableIncomeMOP * 0.10;
    else if (TaxableIncomeMOP <= 424000)
      taxMOP = TaxableIncomeMOP * 0.11;
    else
      taxMOP = TaxableIncomeMOP * 0.12;

  // Display the result	

  cout << "HKD Tax is " << static_cast<double>(taxMOP * 100) / 100.0 << endl;
  cout << "Enter Exchange Rate between MOP and USD: ";
  double EXRateUSDMOP;
  cin >> EXRateUSDMOP;
  taxUSD = taxMOP/EXRateUSDMOP;
  cout << "USD Tax is " << static_cast<double>(taxUSD * 100) / 100.0 << endl;
  return 0;
}
