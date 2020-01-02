// xfunction.h
#include <iostream>
using namespace std;

// xfunction.cpp
long xfunction(long n) {
    cout << "long >> ";
    return n;
}

int xfunction(int n, long t) {
    cout << "int >> ";
    return t - n;
}

short xfunction(short m, long n, int p) {
    cout << "long >> ";
    return p + n + m;
}

// xdriver.cpp
int main() {
    cout << xfunction(5) << endl;
    cout << xfunction(5,10) << endl;
    cout << xfunction(5,10,15) << endl;
}

/*
Compile and Execute multiple .cpp in terminal
>> g++ xfunction.cpp xdriver.cpp -o xfunction
>> ./xfunction
*/