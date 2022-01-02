//Array Pair sum division problem
class Solution {
    public boolean canPair(int[] nums, int k) {
        if (nums.length % 2 == 1)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = (nums[i] % k);
            if (!map.containsKey(remainder)) {
                map.put(remainder, 0);
            }
            map.put(remainder, map.get(remainder) + 1);
        }

        for (int i = 0; i < nums.length; i++) {

            int remainder = (nums[i] % k);

            if (2 * remainder == k) {
                // if remainder is k/2 then it must have have even occurance 
                if (map.get(remainder) % 2 == 1)
                    return false;
            }

            if (remainder == 0) {
                // if remainder is 0 then it must have have even occurance in order to create pair 
                if (map.get(remainder) % 2 == 1)
                    return false;
            }

            else {
                if (map.get(k - remainder) != map.get(remainder))
                    return false;
            }
        }
        return true;
    }
}
