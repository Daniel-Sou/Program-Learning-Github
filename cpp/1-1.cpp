/*
Make the simple program to convert the currency
*/

#include <stdlib.h>
#include <iostream>

using namespace std;

int main(){
    int i,a = 10;

    int newNum = 10 + ++i;

    cout << ++a << "\n";
    cout << i << "\n";
    cout << "Result is " << newNum << endl;
}