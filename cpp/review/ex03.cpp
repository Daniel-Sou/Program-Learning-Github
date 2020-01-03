// ex03.cpp

#include <iostream>

using namespace std;

// Export the answer b to s
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

  cout << r << "\t" << s << "\t" << t << endl;

  return 0;
}

/*
Output
>> 1 14 3
*/