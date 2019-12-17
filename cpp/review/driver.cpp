// functionClassDriver.cpp

#include <iostream>
#include "xfunction.h"

using namespace std;

long xfunction(long n)
{
    cout << "long >> ";
    return n;
}

int xfunction(int n, long t)
{
    cout << "int >> ";
    return t - n;
}

short xfunction(short m, long n, int p)
{
    cout << "long >> ";
    return p + n + m;
}

int main()
{
    cout << xfunction(5) << endl;
    cout << xfunction(5, 10) << endl;
    cout << xfunction(5, 10, 15) << endl;
}