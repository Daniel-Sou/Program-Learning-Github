/*
Write a C++ program to print the first 50 positive even numbers (excluding zero) to a text file named “outfile.txt” using a while loop.  Print the word “DONE!” on the output screen of your computer when the program terminates. 

Use the following names for your variables:  outputfile; count; number;

The output in the text file should contain 5 integers per line. 
*/

#include <iostream>
#include <fstream>

using namespace std;

int count;
int number = 1;

int main() {

  ofstream outputfile;

  outputfile.open("outfile.txt");


  while (count <= 49) {
    if(number % 2 == 0 ) {
      outputfile << number << "\t";
      cout << number << "\t";  
      count++;
    }

    number++;

    if (count % 5 == 0) {
      outputfile << "\n";
      cout << "\n";
    }
  }

  // Close file
  outputfile.close();

  cout << "DONE!" << endl;

  return 0;
}
