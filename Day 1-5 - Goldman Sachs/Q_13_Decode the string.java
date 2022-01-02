class Solution{
    static String decodedString(String s){
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> stringst = new Stack<>();     
        int cnt = 0;
        stringst.push(new StringBuilder());
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '[') {
                stringst.push(new StringBuilder());
                st.push(cnt);
                cnt = 0;
            } else if(ch == ']') {
                String str = stringst.pop().toString(); 
                int times = st.pop();
                StringBuilder string = stringst.peek();
                for(int j = 0; j < times; j++){
                    string.append(str);
                    //System.out.println(string.toString());
                }
            }  else if(ch - '0' >= 0 && ch - '0' <= 9) {
                cnt = cnt * 10 + (ch - '0');
            } else {
                stringst.peek().append(ch);
            }
        }
        
        return stringst.pop().toString();
    }
}
