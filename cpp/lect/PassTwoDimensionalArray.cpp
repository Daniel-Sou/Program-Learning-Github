#include <iostream>

using namespace std;

const int COLUMN_SIZE = 3;

// Sum the array element
int sum(const int array[][COLUMN_SIZE], int rowSize) {
    int total = 0;

    for (int row = 0; row < rowSize; row++) {
        for (int column = 0; column < COLUMN_SIZE; column++) {
            total += array[row][column];
        }
    }

    return total;
}

int main() {
    int array[4][3] = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}
    };

    // Print the array
    for (int i=0; i < 4; i++) {
        for (int j=0; j< 3; j++) {
            cout << array[i][j] << "\t\t";
        }

        cout << endl;
    }

    cout << "\nSum of all elements is >> ";
    cout << sum(array,4) << endl;

    return 0;
}