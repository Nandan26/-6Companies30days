class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans=new  ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n-3;i++)
        {
            int first=arr[i];
            for(int j=i+1;j<n-2;j++)
            {
                int start=j+1;
                int end=n-1;
                int second=arr[j];
                while(start<end)
                {
                    sum = first + second + arr[start] + arr[end];
                    if(sum < k)
                    {
                        start++;
                    }
                    else if(sum > k)
                    {
                        end--;
                    }
                    else{

                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(first);
                        temp.add(second);
                        temp.add(arr[start]);
                        temp.add(arr[end]);
                        if(!ans.contains(temp))
                        {
                            ans.add(temp);
                        }
                        start++;
                        end--;
                    }
                }
            }
        }
        return ans;
    }
}
