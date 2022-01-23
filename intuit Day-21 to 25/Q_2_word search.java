class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
                if(board[i][j]==word.charAt(0) && helper(board,word,0,i,j))
                    return true;

        return false;
    }

    private boolean helper(char[][] b, String word, int poss, int r, int c){

        if(word.length() <= poss)
            return true;

        if(r<0 ||c<0 || r>=b.length || c>=b[0].length || b[r][c]=='1' || b[r][c]!=word.charAt(poss))
            return false;

        char tmp = b[r][c];
        b[r][c] = '1';

        if(helper(b,word,poss+1,r+1,c) ||
                helper(b,word,poss+1,r-1,c) ||
                helper(b,word,poss+1,r,c+1) ||
                helper(b,word,poss+1,r,c-1))
            return true;

        b[r][c] = tmp;

        return false;
    }
}
