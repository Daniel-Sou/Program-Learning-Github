/* 
Testing Simple File IO (TestSimpleFileIO.cpp) 
*/

#include <iostream>
#include <fstream> // File output header
#include <cstdlib>
#include <string>

using namespace std;

int main() {
  string filename = "file.txt";

  // Write to File
  ofstream fout(filename.c_str()); // Default mode is ios::cout | ios::trunc

  if(!fout) {
    cerr << "Error: Open file for output failed!!!" << endl;
    abort(); // in <cstdlib> header
  }

  fout << "Word 1: Apple" << endl;
  fout << "Word 2: Orange" << endl;
  fout << "Word 3: Banana" << endl;
  fout.close();

  // Read from file
  ifstream fin(filename.c_str()); // Default mode ios::in

  if(!fin) {
    cerr << "Error: open file for input failed!!!" << endl;
    abort();
  }

  char ch;

  // Till end-of-file
  while (fin.get(ch)) {
    cout << ch;
  }

  fin.close();

  return 0;
}