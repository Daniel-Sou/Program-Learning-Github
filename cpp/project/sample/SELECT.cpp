#include <iostream>
using namespace std;

double CalHKTax(double TaxableIncomeHKD)
{
	double taxHKD = 0;
	if (TaxableIncomeHKD <= 0)
		taxHKD = 0;
	else if (TaxableIncomeHKD <= 50000)
		taxHKD = TaxableIncomeHKD * 0.02;
	else if (TaxableIncomeHKD <= 100000)
		taxHKD = 50000 * 0.02 + (TaxableIncomeHKD - 50000) * 0.06;
	else if (TaxableIncomeHKD <= 150000)
		taxHKD = 50000 * 0.02 + 50000 * 0.06 + (TaxableIncomeHKD - 100000) * 0.1;
	else if (TaxableIncomeHKD <= 200000)
		taxHKD = 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + (TaxableIncomeHKD - 150000) * 0.14;
	else
		taxHKD = 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + 50000 * 0.14 + (TaxableIncomeHKD - 200000) * 0.17;
	return taxHKD;
}

double CalMOTax(double TaxableIncomeMOP)
{
	double taxMOP = 0;
	if (TaxableIncomeMOP <= 0)
		taxMOP = 0;
	else if (TaxableIncomeMOP <= 164000)
		taxMOP = TaxableIncomeMOP * 0.07;
	else if (TaxableIncomeMOP <= 184000)
		taxMOP = TaxableIncomeMOP * 0.08;
	else if (TaxableIncomeMOP <= 224000)
		taxMOP = TaxableIncomeMOP * 0.09;
	else if (TaxableIncomeMOP <= 304000)
		taxMOP = TaxableIncomeMOP * 0.10;
	else if (TaxableIncomeMOP <= 424000)
		taxMOP = TaxableIncomeMOP * 0.11;
	else
		taxMOP = TaxableIncomeMOP * 0.12;
	return taxMOP;
}

double CalUSATax(double incomeUSD)
{
	double taxUSDinUSA = 0;
	// Compute tax for single filers
	if (incomeUSD <= 9525)
		taxUSDinUSA = incomeUSD * 0.10;
	else if (incomeUSD <= 38700)
		taxUSDinUSA = 9525 * 0.10 + (incomeUSD - 9525) * 0.12;
	else if (incomeUSD <= 82500)
		taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (incomeUSD - 38700) * 0.22;
	else if (incomeUSD <= 157500)
		taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (incomeUSD - 82500) * 0.24;
	else if (incomeUSD <= 200000)
		taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (157000 - 82500) * 0.24
		+ (incomeUSD - 157500) * 0.32;
	else if (incomeUSD <= 500000)
		taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (157000 - 82500) * 0.24
		+ (200000 - 157500) * 0.32 + (incomeUSD - 200000) * 0.35;
	else
		taxUSDinUSA = 9525 * 0.10 + (38700 - 9525) * 0.12 + (82500 - 38700) * 0.22 + (157000 - 82500) * 0.24
		+ (200000 - 157500) * 0.32 + (500000 - 200000) * 0.35 + (incomeUSD - 500000) * 0.37;
	return taxUSDinUSA;
}

int main()
{
		int ans;
		double incomeHKD;
		double incomeUSD;
		double incomeMOP;
		double taxHKD = 0;
		double taxMOP = 0;
		double taxUSD = 0;
		double TaxableIncomeHKD;
		double USDHKDExchangeRate;
		double USDMOPExchangeRate;
		double taxUSDinUSA;
		double TaxableIncomeMOP;
		double GlobalTax;
		
		cout << "Please select the settlement currency of your income(HKD = 1, MOP = 2): ";
		cin >> ans;
		
		if (ans == 1)

		{
			cout << "Enter your income in HKD: ";
			cin >> incomeHKD;
			cout << "Enter Exchange Rate between HKD and USD: ";
			cin >> USDHKDExchangeRate;
			incomeUSD = incomeHKD / USDHKDExchangeRate;
			taxHKD = CalHKTax(incomeHKD);
			TaxableIncomeHKD = taxHKD / USDHKDExchangeRate;
			cout << "HKD Tax in Hong Kong is " << static_cast<int>(taxHKD * 100) / 100.0 << endl;
			cout << "USD Tax in Hong Kong is " << static_cast<int>(TaxableIncomeHKD * 100) / 100.0 << endl;
			taxUSDinUSA = CalUSATax(incomeUSD);
			cout << "Tax in USA is " << static_cast<int>(taxUSDinUSA * 100) / 100.0 << endl;
			GlobalTax = taxUSDinUSA - TaxableIncomeHKD;

		}
		else
		{
			cout << "Enter your income in MOP: ";
			cin >> incomeMOP;
			cout << "Enter Exchange Rate between MOP and USD: ";
			cin >> USDMOPExchangeRate;
			incomeUSD = incomeMOP / USDMOPExchangeRate;
			taxMOP = CalMOTax(incomeMOP);
			TaxableIncomeMOP = taxMOP / USDMOPExchangeRate;
			cout << "MOP Tax in MACAU is " << static_cast<int>(taxMOP * 100) / 100.0 << endl;
			cout << "USD Tax in MACAU is " << static_cast<int>(TaxableIncomeMOP * 100) / 100.0 << endl;
			taxUSDinUSA = CalUSATax(incomeUSD);
			cout << "Tax in USA is " << static_cast<int>(taxUSDinUSA * 100) / 100.0 << endl;
			GlobalTax = taxUSDinUSA - TaxableIncomeMOP;

		}
				
		if (GlobalTax <= 0.0)
	{
		cout << "you do not need to pay global tax" << endl;
	}
	else
		cout << "Your Global Tax is:" << GlobalTax << " Dollars" << endl;

	return 0;
}


