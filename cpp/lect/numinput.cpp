/*
Simple File Input 
*/


#include <iostream>
#include <fstream>

using namespace std;

int main() {
  ifstream input;

  // Open a file
  input.open("number.csv");

  int score1, score2, score3;

  // Read Data
  input >> score1;
  input >> score2;
  input >> score3;

  cout << "Total score >> " << score1 + score2 + score3 << endl;

  // Close file
  input.close();

  cout << "Done" << endl;

  return 0;
}