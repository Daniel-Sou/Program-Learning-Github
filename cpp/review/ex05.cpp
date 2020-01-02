// ex05.cpp

#include <iostream>

using namespace std;

void something ( int a, int& b )
{
  int c;
  c = a + 2;
  a = a * 3;
  b = c + a;
}

int main(){
  int r = 1;
  int s = 2;
  int t = 3;

  something(t,s);

  cout << r << ' ' << s << ' ' << t << endl;

  return 0;
}