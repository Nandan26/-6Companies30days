/* 
Suppose that we have 8*8 chessboard
square of size 1 x 1: 8 * 8 = 64 squares.
square of size 2 x 2: 7 * 7 = 49 squares.
square of size 3 x 3: 6 * 6 = 36 squares.
square of size 4 x 4: 5 * 5 = 25 squares.
square of size 5 x 5: 4 * 4 = 16 squares.
square of size 6 x 6: 3 * 3 = 9 squares.
square of size 7 x 7: 2 * 2 = 4 squares.
square of size 8 x 8: 1 * 1 = 1 square.

for N*N chessboard
1^2 + 2^2 + 3^2 + ... + N^2 = N(N+1)(2N+1) / 6 
*/

class Solution
{
    // Function to return count of squares;
    public int countSquares(int n)
    {
        return (n * (n + 1) * (2 * n + 1) / 6;
    }
}
     
