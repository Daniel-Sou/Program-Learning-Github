#include <iostream>

using std::cout;
using std::ios;
#include <iomanip>
using std::setw;
using std::setprecision;
using std::setiosflags;
using std::resetiosflags;
#include <cstdlib>
#include <ctime>

void shuffle( int [][ 13 ] );
void deal( const int [][ 13 ], const char *[], const char *[], int [][ 2 ] );
void pair( const int [][ 13 ], const int [][ 2 ], const char *[] );
void threeOfKind( const int [][ 13 ], const int [][ 2 ], const char *[] );
void fourOfKind( const int [][ 13 ], const int [][ 2 ], const char *[] );
int flushHand( const int [][ 13 ], const int [][ 2 ], const char *[] );
int straightHand( const int [][ 13 ], const int [][ 2 ], const char *[],
const char *[] );

int main()
{
  const char *suit[] = { "Hearts", "Diamonds", "Clubs", "Spades" },
  *face[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
   int deck[ 4 ][ 13 ] = { 0 }, hand[ 5 ][ 2 ] = { 0 };
  int check1 = 0;
  int check2 = 0;
  srand( time( 0 ) );

  shuffle( deck );
  deal( deck, face, suit, hand );
  pair( deck, hand, face );
  threeOfKind( deck, hand, face );
  fourOfKind( deck, hand, face );
  check1 = flushHand( deck, hand, suit );
  check2 = straightHand( deck, hand, suit, face );
  if (check1 == 1 && check2 == 1)
  {
      cout << "It is a straight plus flush" << '\n' ;
  }
  if (check1 == 0 || check2 == 0)
  {
      cout << "It is not a straight plus flush" << '\n' ;
  }
  return 0;
  }

  void shuffle( int wDeck[][ 13 ] )
 {
  int row, column;

  for ( int card = 1; card <= 52; ++card ) {
   do {
   row = rand() % 4;
   column = rand() % 13;
   }
   while ( wDeck[ row ][ column ] != 0 );

   wDeck[ row ][ column ] = card;
    }
  }

 // deal a five card poker hand
  void deal( const int wDeck[][ 13 ], const char *wFace[],
  const char *wSuit[], int wHand[][ 2 ] )
  {
    int r = 0;

    cout << "The hand is:\n";

    for ( int card = 1; card < 6; ++card )
    for ( int row = 0; row <= 3; ++row )
    for ( int column = 0; column <= 12; ++column )
    if ( wDeck[ row ][ column ] == card ) {
    wHand[ r ][ 0 ] = row;
    wHand[ r ][ 1 ] = column;
    cout << setw( 5 ) << wFace[ column ] << " of " << setw( 8 ) << setiosflags( ios::left ) << wSuit[ row ] << ( card % 2 == 0 ? '\n' : '\t' )  << resetiosflags( ios::left );
    ++r;
   }

   cout << '\n';
  }

 // pair determines if the hand contains one or two pair
 void pair( const int wDeck[][ 13 ], const int wHand[][ 2 ],
 const char *wFace[] )
 {
   int counter[ 13 ] = { 0 };

   for ( int r = 0; r < 5; ++r )
   ++counter[ wHand[ r ][ 1 ] ];
   cout << '\n';

   for ( int p = 0; p < 13; ++p )
   if ( counter[ p ] == 2 )
   cout << "The hand contains a pair of " << wFace[ p ] << "'s.\n";
 }

 void threeOfKind( const int wDeck[][ 13 ], const int wHand[][ 2 ],
 const char *wFace[] )
 {
   int counter[ 13 ] = { 0 };

   for ( int r = 0; r < 5; ++r )
   ++counter[ wHand[ r ][ 1 ] ];

   for ( int t = 0; t < 13; t++ )
   if ( counter[ t ] == 3 )
   cout << "The hand contains three " << wFace[ t ] << "'s.\n";
 }

 void fourOfKind( const int wDeck[][ 13 ], const int wHand[][ 2 ],
 const char *wFace[] )
 {
   int counter[ 13 ] = { 0 };

   for ( int r = 0; r < 5; ++r )
   ++counter[ wHand[ r ][ 1 ] ];

   for ( int k = 0; k < 13; ++k )
   if ( counter[ k ] == 4 )
   cout << "The hand contains four " << wFace[ k ] << "'s.\n";
 }

 int flushHand( const int wDeck[][ 13 ], const int wHand[][ 2 ],
 const char *wSuit[] )
 {
   int count[ 4 ] = { 0 };

   for ( int r = 0; r < 5; ++r )
   ++count[ wHand[ r ][ 0 ] ];

   for ( int f = 0; f < 4; ++f )
   if ( count[ f ] == 5 )
   {
   cout << "The hand contains a flush of " << wSuit[ f ] << "'s.\n";
   return 1;
   }
   return 0;
 }

 int straightHand( const int wDeck[][ 13 ], const int wHand[][ 2 ],
 const char *wSuit[], const char *wFace[] )
 {
 int s[ 5 ] = { 0 }, temp;

 // copy column locations to sort
 for ( int r = 0; r < 5; ++r )
 s[ r ] = wHand[ r ][ 1 ];

 // bubble sort column locations
 for ( int pass = 1; pass < 5; ++pass )
 for ( int comp = 0; comp < 4; ++comp )
 if ( s[ comp ] > s[ comp + 1 ] ) {
 temp = s[ comp ];
 s[ comp ] = s[ comp + 1 ];
 s[ comp + 1 ] = temp;
 }

 // check if sorted columns are a straight
 if ( s[ 4 ] - 1 == s[ 3 ] && s[ 3 ] - 1 == s[ 2 ] && s[ 2 ] - 1 == s[ 1 ] && s[ 1 ] - 1 == s[ 0 ] )
    {
 cout << "The hand contains a straight consisting of\n";
 return 1;
 for ( int j = 0; j < 5; ++j )
 cout << wFace[ wHand[ j ][ 1 ] ] << " of " << wSuit[ wHand[ j ][ 0 ] ]
 << '\n';
 }
 return 0;
 }

