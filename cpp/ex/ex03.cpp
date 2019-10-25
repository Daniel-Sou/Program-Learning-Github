#include <iostream>

int main()
{
    int n1 = 10;
    int n2 = 10;

    // While-loop 1
    while(n1 > 0) {
        n1 /= 2;
    }

    // "\n" means hold a new line
    std::cout << "Format I \n" << n1 * n1 << "\n";

    // While-loop 2

    std::cout << "Format II" << "\n"; 
    while (n2 > 0) {
        n2 /= 2;
        // "\t" means hold a tab
        std::cout << n2 * n2 << "\t";
    }

    std::cout << "\n";
    
    return 0;
}