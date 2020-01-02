#include <iostream>

using namespace std;

int main()
{ 
  int list[] = {10, 20, 40, 80, 100};
  cout << list[1] << " and " << list[4] << endl;
  list[2] += list[3]++;
  cout << list[2] << " and " << list[3] << endl;

   return 0;
}