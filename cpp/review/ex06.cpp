// ex06.cpp

#include <iostream>
#include <cstring>

using namespace std;

int GuessWhat(const char[], int);

int main() {
  int size;
  char string[80];
  cout << "Please enter the name of a book: ";
  cin >> string;
  size = strlen(string);
  cout << GuessWhat(string, size) << endl;
  return 0;
}

int GuessWhat(const char string[], int arraysize) {
  int i;
  for (i = 0; i < arraysize; i++) {
    cout << string[i];
  }
  cout << endl;

  return i;
}