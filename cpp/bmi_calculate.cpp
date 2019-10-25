#include <iostream>
using namespace std;

int main()
{
  // Prompt the user to enter weight in pounds
  cout << "Enter weight in pounds: ";
  double weight;
  cin >> weight;

  // Prompt the user to enter height in inches
  cout << "Enter height in inches: ";
  double height;
  cin >> height;

  const double KILOGRAMS_PER_POUND = 0.45359237; // Constant
  const double METERS_PER_INCH = 0.0254; // Constant

  // Compute BMI
  double weightInKilogram = weight * KILOGRAMS_PER_POUND;
  double heightInMeters = height * METERS_PER_INCH;
  double bmi = weightInKilogram /
    (heightInMeters * heightInMeters);

  // Display result
  cout << "Your BMI is " << bmi << endl;
  if (bmi < 16)
    cout << "You are seriously underweight" << endl;
  else if (bmi < 18)
    cout << "You are underweight" << endl;
  else if (bmi < 24)
    cout << "You are normal weight" << endl;
  else if (bmi < 29)
    cout << "You are over weight" << endl;
  else if (bmi < 35)
    cout << "You are seriously over weight" << endl;
  else
    cout << "You are gravely over weight" << endl;
  return 0;
}