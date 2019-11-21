#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <ctime>
using std::cout;
using std::ios;
using std::setw;
using std::setprecision;
using std::setiosflags;
int main()
   {
    const long ROLLS = 36000;
    const int SIZE = 19;
    // array exepected contains counts for the expected
    // number of times each sum occurs in 36 rolls of the dice
    int expected[ SIZE ] = { 0, 0,0, 1, 4, 6, 10, 15, 21,25,27,27,25,21,15, 10, 6, 3, 1 };
    int x, y, z, sum[ SIZE ] = { 0 };

    srand( time( 0 ) );

   for ( long i = 1; i <= ROLLS; ++i ) {
     x = 1 + rand() % 6;
     y = 1 + rand() % 6;
     z = 1 + rand() % 6;
     ++sum[ x + y + z];
    }

   cout << setw( 10 ) << "Sum" << setw( 10 ) << "Total" << setw( 10 ) << "Expected" << setw( 10 ) << "Actual\n" << setiosflags( ios::fixed | ios::showpoint );

   for ( int j = 3; j < SIZE; ++j )
   cout << setw( 10 ) << j << setw( 10 ) << sum[ j ] << setprecision( 3 ) << setw( 9 ) << 100.0 * expected[ j ] / 216 << "%" << setprecision(3) << setw( 9 ) << 100.0 * sum[ j ] / 36000 << "%\n";

 return 0;
   }
