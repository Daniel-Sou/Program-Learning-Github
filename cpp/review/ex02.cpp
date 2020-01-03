// ex02.cpp

#include <iostream>
#include <cstdlib> 

using namespace std;
 
void swap3(int& a, int& b){
    int tmp;
    tmp = a;
    a = b;
    b = tmp;
}
 
int main(){
    int a = 1;
    int b = 2;
    cout << "before a = " << a << " and b = " << b << endl;
    swap3(a, b);
    cout << "After swap" << endl;    
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    
    system("ls"); // System operation in C++
    return 0;
}