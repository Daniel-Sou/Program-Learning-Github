// xdriver.cpp

#include <iostream>
#include "xfunction.h"

using namespace std;

int main()
{
    cout << xfunction(5) << endl;
    cout << xfunction(5, 10) << endl;
    cout << xfunction(5, 10, 15) << endl;

    return 0;
}