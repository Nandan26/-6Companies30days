class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        int i=0,j=0;
        int t=0;
        while(j<n)
        {
            
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[j])
            {
                dq.pollLast();
            }
            dq.offerLast(j);
            
            
            if(j-i+1==k)
            {
                
                res.add(arr[dq.peekFirst()]);
                
                if(dq.peekFirst()==i)
                    dq.pollFirst();
                i++;
            }
            
            if((j-i+1)<k)
                j++;
        }
        return res;
        
    }
}
