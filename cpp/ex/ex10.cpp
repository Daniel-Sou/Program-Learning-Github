#include <stdlib.h>
#include <iostream>

using namespace std;

int main()
{
    cout << "Here's a list of the ASCII values \nof all the upper case letters.\n";
    char letter = 'A';
    while (letter <= 'Z') {
        cout << letter << "\t" << int(letter) << endl;
        ++ letter;
    }
}