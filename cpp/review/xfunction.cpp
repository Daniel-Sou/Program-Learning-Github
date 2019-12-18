#include "xfunction.h"

// Construct a default xfunction object
xfunction::xfunction() {
    
}

// Construct a xfunction object
long xfunction::xfunction(long t) {
    cout << "long >> ";
    return t;
}

int xfunction::xfunction(int n, long t) {
    cout << "int >> ";
    return t - n;
}

short xfunction::xfunction(short m, long t, int n) {
    cout << "long >> ";
    return p + n + m;
}
