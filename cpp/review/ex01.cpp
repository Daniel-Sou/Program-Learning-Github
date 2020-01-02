// ex01.cpp


#include <iostream>
using namespace std;

void swap2(int *a, int *b){
  int tmp;
  tmp = *a;
  *a = *b;
  *b = tmp;
}

int main(){
    int a = 1;
    int b = 2;
    cout<< "a = " << a <<endl;
    cout<< "b = " << b <<endl;
    swap2(&a, &b);
    cout << "After Swap" << endl;
    cout<<"a = "<< a << endl;
    cout<<"b = "<< b << endl;
    return 0;
}