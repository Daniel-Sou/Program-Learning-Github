// ex04.cpp

#include <iostream>
 
using namespace std;
 
int& function(int& f)
{
    f=f+3;
    return f;
}
 
int main(int argc, char** argv)
{
    int x = 7;
    int y;
    y = function(x);
    cout << "Input: " << x << endl;
    cout << "Output: " << y << endl;
    return 0;
}