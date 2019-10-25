/*
For loop function - sum_from_to(1,4) = 10
*/

#include <iostream>

int sum_from_to(int first, int last);

int main() {

    std::cout << sum_from_to(4, 7) << "\n";

    std::cout << sum_from_to(1,4) << "\n";

    std::cout << sum_from_to(9,7) << "\n";
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
