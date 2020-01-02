#include <iostream>
using namespace std;

void f1(int x, int& y)
{   
  x++;
  y++;
}

int main()
{   
  int i = 3, j = 6;
  f1(i, j);
  cout << "i is " << i << endl;
  cout << "j is " << j << endl;
  return 0;
}