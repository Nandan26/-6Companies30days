//count subarrays
class Solution {  
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int i=0,j=0;
        int ans=0;
        long multi=1;
        while(j<n){
            multi=(long) multi * a[j];
            while(multi>=k && i<=j){
                
                multi=(long) multi / a[i];
                i++;
            }
            ans += j - i + 1;
            j++;
        }
        return ans;

    }
}
