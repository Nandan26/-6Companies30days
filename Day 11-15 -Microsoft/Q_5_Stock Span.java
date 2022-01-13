class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {

        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] res=new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {


            while (!st.empty() && price[st.peek()] <= price[i])
                st.pop();

            res[i] = (st.empty()) ? (i + 1) : (i - st.peek());

            st.push(i);
        }
        return res;
    }

}
