/*
For loop function - sum_from_to(1,4) = 10
*/

#include <iostream>

using namespace std;

int sum_from_to(int first, int last);

int main() {
    int first, last;

    cout << "Please put the first value >> " << endl;
    cin >> first;
    cout << "Please put the last value >> " << endl;
    cin >> last;

    cout << "\n" << first << "..." << last << endl;
    cout << sum_from_to(first, last) << "\n" << endl;

    cout << sum_from_to(4, 7) << "\n";

    cout << sum_from_to(1,4) << "\n";

    cout << sum_from_to(9,7) << "\n";

    return 0;
}

int sum_from_to(int first, int last)
{
    int sum = 0;

    if (first <= last)
    {
        for (int i = first; i <= last; ++i)
        {
            sum = sum + i;
        }
    }
    else
    {
        for (int i = first; i >= last; --i)
        {
            sum = sum + i;
        }
    }

    return sum;
}
