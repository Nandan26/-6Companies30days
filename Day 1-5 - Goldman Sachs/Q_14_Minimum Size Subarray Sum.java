class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0) return 0;
        int i=0,j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= target) {
              ans = Math.min(ans, j - i);
              sum -= nums[i++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
