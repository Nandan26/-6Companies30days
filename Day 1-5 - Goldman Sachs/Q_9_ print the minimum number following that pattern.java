class Solution{
    static String printMinNumberForPattern(String S){
        String ans = "";

        Stack<Integer> st = new Stack<Integer>();
 
        for (int i = 0; i <S.length(); i++) {

            st.push(i + 1);

            if (S.charAt(i) == 'I') {
                
                while (!st.empty()) {

                    ans += String.valueOf(st.pop());
                }
            }
        }
        st.push(S.length()+1);
        while (!st.empty()) {
            ans += String.valueOf(st.pop());
        }
        return ans;
    }
}
