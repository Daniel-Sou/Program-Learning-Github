#include <iostream>
using namespace std;
main()
{
  const int LENGTH = 21;
  char message[LENGTH];
  cout << "Enter a sentence on the line below." << endl;
  cin >> message;
  cout << message << endl;
  return 0;
}
