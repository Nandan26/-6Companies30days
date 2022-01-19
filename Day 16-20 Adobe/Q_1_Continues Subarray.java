class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int i = 0;
        int j = 0;
        int sum = arr[0];

        while(i < n && j < n){
            if(sum == s){
                if(i == j)
                    return new ArrayList<>(List.of(i+1,i+1));
                else
                    return new ArrayList<>(List.of(i+1,j+1));
            }
            if(sum < s)
                sum += arr[++j];
            else
                sum -= arr[i++];
        }
        return new ArrayList<>(List.of(-1));
    }
}
