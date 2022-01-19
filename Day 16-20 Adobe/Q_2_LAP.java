//User function Template for Java

class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        if(n<=2) return n;
        int ans=0;
        HashMap<Integer, Integer> maps[] = new HashMap[n];


        for(int i=0;i<n;i++){
            maps[i]=new HashMap<>();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int diff = A[i] - A[j];

                if(!maps[j].containsKey(diff)){
                    maps[i].put(diff,2);
                }
                else{
                    maps[i].put(diff,maps[j].get(diff)+1);
                }

                ans = Math.max(ans,maps[i].get(diff));
            }
        }

        return ans;
    }
}
