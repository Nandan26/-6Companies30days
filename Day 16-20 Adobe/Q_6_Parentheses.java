class Solution {

    public List<String> AllParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        helper(ans, "", n, n);
        return ans;
    }

    private void helper(List<String> ans, String str, int open, int close){

        if(open==0 && close==0){
            ans.add(str);
            return;
        }

        if(open > 0)
            helper(ans,str+"(", open-1, close);
        if(close > open)
            helper(ans, str+")", open, close-1);
    }
}
