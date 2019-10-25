# C++ Notes
This is C++ Note. The course is ISOM3029.

## Project

## Program Structure

Format I.
```cpp

#include <iostream>

int main() {

  std::cout << "1\n";
  std::cout << "2\n";
  std::cout << "3\n";

}

```

Format II.

``` cpp
#include <stdlib.h>
#include <iostream>

using namespace std;

int main(){
    int i,a = 10;

    // newNum = 10 + (i = i + 1);
    int newNum = 10 + ++i;

    // ++a = 10 + 1 = 11;
    cout << ++a << "\n";
    cout << "Result is " << newNum << endl;
}
```
