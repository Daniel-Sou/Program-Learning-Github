#include <iostream>
#include <cmath>

using namespace std;

int main()
{ // Enter Tencent Stock Price:
  cout << " We will calculate the value of a portfolio that contains two stocks: Tencent and AIA "<<  endl ;
  cout << " Enter Tencent Stock Price: for example 350: "<<  endl;
  double TencentPrice;
  cin >> TencentPrice;
  // Enter Number of Tencent Stocks:
  int NumTencent ;
  cout << " Enter Number of Tencent Stocks: ";
cin >> NumTencent;

cout << " Enter AIA Stock Price: for example 80: ";
  double AIAPrice;
  cin >> AIAPrice;
  // Enter Number of AIA Stocks:
  int NumAIA ;
  cout << " Enter Number of AIA Stocks: ";
cin >> NumAIA;

// Calculate Value of Tencent Stocks
double TencentValue;
TencentValue = TencentPrice * NumTencent;
cout << "\nValue of the Tencent stocks is " << TencentValue << endl ;

// Calculate Value of AIA Stocks
double AIAValue;
AIAValue = AIAPrice * NumAIA;
cout << "Value of the AIA stocks is " << AIAValue << endl ;
double PortValue;
PortValue = TencentValue + AIAValue;
cout << "Value of the Portfolio is:  " << PortValue << endl ;
  return 0;
}
