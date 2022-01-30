class Solution{
    static int height(int N){
        int height = (N * 8) + 1;
        return ((int)Math.sqrt(height) - 1 ) / 2;
    }
}
