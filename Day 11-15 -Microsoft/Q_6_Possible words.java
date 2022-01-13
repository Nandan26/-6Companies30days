class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(N == 0)
            return ans;
        int curr = 0;
        String op = "";
        String digit[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(a,N,curr,digit,op,ans);
        return ans;
    }

    static void helper(int a[],int n,int curr,String digit[],String op,ArrayList<String> ans){

        if(curr >= n){
            ans.add(op);
            return;
        }

        String temp = digit[a[curr]];

        for(int i=0;i<temp.length();i++){
            char ch = temp.charAt(i);
            helper(a,n,curr+1,digit,op+ch,ans);
        }

    }
}
