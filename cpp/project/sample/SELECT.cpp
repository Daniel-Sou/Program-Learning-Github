
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
double CalMOTax65(double TaxableIncomeMOP)
{
	double taxMOP = 0;
	if (TaxableIncomeMOP <= 0)
		taxMOP = 0;
	else if (TaxableIncomeMOP <= 218000)
		taxMOP = TaxableIncomeMOP * 0.07;
	else if (TaxableIncomeMOP <= 238000)
		taxMOP = TaxableIncomeMOP * 0.08;
	else if (TaxableIncomeMOP <= 278000)
		taxMOP = TaxableIncomeMOP * 0.09;
	else if (TaxableIncomeMOP <= 358000)
		taxMOP = TaxableIncomeMOP * 0.10;
	else if (TaxableIncomeMOP <= 478000)
		taxMOP = TaxableIncomeMOP * 0.11;
	else
		taxMOP = TaxableIncomeMOP * 0.12;
	return taxMOP;
}
double CalUSATax(double incomeUSD)
{
	double taxUSDinUSA = 0;
	// Compute tax for single filers
	if (incomeUSD <= 9275)
		taxUSDinUSA = incomeUSD * 0.10;
	else if (incomeUSD <= 37650)
		taxUSDinUSA = 9275 * 0.10 + (incomeUSD - 9525) * 0.15;
	else if (incomeUSD <= 91150)
		taxUSDinUSA = 9275 * 0.10 + (37650 - 9525) * 0.15 + (incomeUSD - 38700) * 0.25;
	else if (incomeUSD <= 190150)
		taxUSDinUSA = 9275 * 0.10 + (37650 - 9525) * 0.15 + (91150 - 37650) * 0.25 + (incomeUSD - 91150) * 0.28;
	else if (incomeUSD <= 411350)
		taxUSDinUSA = 9275 * 0.10 + (37650 - 9525) * 0.15 + (91150 - 37650) * 0.25 + (190150 - 91150) * 0.28
		+ (incomeUSD - 190150) * 0.33;
	else if (incomeUSD <= 415050)
		taxUSDinUSA = 9275 * 0.10 + (37650 - 9525) * 0.15 + (91150 - 37650) * 0.25 + (190150 - 91150) * 0.28
		+ (411350 - 190150) * 0.33 + (incomeUSD - 411350) * 0.35;
	else
		taxUSDinUSA = 9275 * 0.10 + (37650 - 9525) * 0.15 + (91150 - 37650) * 0.25 + (190150 - 91150) * 0.28
		+ (411350 - 190150) * 0.33 + (500000 - 411350) * 0.35 + (incomeUSD - 500000) * 0.396;
	return taxUSDinUSA;
}

double CalUSAMarriedTax(double incomeUSD)
{
	double taxUSDinUSA = 0;
	// Compute tax for married filers
	if (incomeUSD <= 18550)
		taxUSDinUSA = incomeUSD * 0.10;
	else if (incomeUSD <= 75300)
		taxUSDinUSA = 18550 * 0.10 + (incomeUSD - 18550) * 0.15;
	else if (incomeUSD <= 151900)
		taxUSDinUSA = 18550 * 0.10 + (75300 - 18550) * 0.15 + (incomeUSD - 75300) * 0.25;
	else if (incomeUSD <= 231450)
		taxUSDinUSA = 18550 * 0.10 + (75300 - 18550) * 0.15 + (151900 - 75300) * 0.25 + (incomeUSD - 151900) * 0.28;
	else if (incomeUSD <= 413350)
		taxUSDinUSA = 18550 * 0.10 + (75300 - 18550) * 0.15 + (151900 - 75300) * 0.25 + (231450 - 151900) * 0.28
		+ (incomeUSD - 231450) * 0.33;
	else if (incomeUSD <= 466950)
		taxUSDinUSA = 18550 * 0.10 + (75300 - 18550) * 0.15 + (151900 - 75300) * 0.25 + (231450 - 151900) * 0.28
		+ (413350 - 231450) * 0.33 + (incomeUSD - 413350) * 0.35;
	else
		taxUSDinUSA = 18550 * 0.10 + (75300 - 18550) * 0.15 + (151900 - 75300) * 0.25 + (231450 - 151900) * 0.28
		+ (413350 - 231450) * 0.33 + (466950 - 413350) * 0.35 + (incomeUSD - 466950) * 0.396;
	return taxUSDinUSA;
}

int main()
{
		int ans;
		char NR;
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
			//For someone who holds US citizenship or green card, and have income in HK
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
			int age;
			cout << "Please enter your age: ";
			cin >> age;
			cout << "Enter your income in MOP: ";
			cin >> incomeMOP;
			cout << "Enter Exchange Rate between MOP and USD: ";
			cin >> USDMOPExchangeRate;
			incomeUSD = incomeMOP / USDMOPExchangeRate;
			if (age < 65)
			{
				taxMOP = CalMOTax(incomeMOP);
			}
			else
			{
				taxMOP = CalMOTax65(incomeMOP);
			}
			TaxableIncomeMOP = taxMOP / USDMOPExchangeRate;
			cout << "MOP Tax in MACAU is " << static_cast<int>(taxMOP * 100) / 100.0 << endl;
			cout << "USD Tax in MACAU is " << static_cast<int>(TaxableIncomeMOP * 100) / 100.0 << endl;
			taxUSDinUSA = CalUSATax(incomeUSD);
            string answer1,answer2,reply
            answer1=yes
            answer2=np
            cout<<"Are you married? if so would you like to report your tax with your husband or wife?\n\n:";
            if((reply==answer1) || (reply==answer2))
            cout << "Tax in USA is " << static_cast<int>(taxUSDinUSA * 100) / 100.0 << endl;
			GlobalTax = taxUSDinUSA - TaxableIncomeMOP;
			  )else(
			  cout << "Tax in USA is " << static_cast<int>(taxUSDinUSA * 100) / 100.0 << endl;
			GlobalTax = taxUSDinUSA - TaxableIncomeMOP;
		}

		cout << "Select your Nationality or region(HK = H, MACAU = M, US = U, HK&US /MO&US = B): ";
		cin >> NR;
		if (GlobalTax <= 0.0)
		{
			cout << "you do not need to pay global tax" << endl;
		}
		else
		{
			if (NR == 'B')
			{
				cout << "Your Global Tax is:" << GlobalTax << "Dollars" << endl;
			}
			else
			{
				cout << "you do not need to pay global tax" << endl;
			}
		}
	return 0;
}


