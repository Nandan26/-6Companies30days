class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (String str : arr)
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }

        int max = 0;
        String win = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > max)
            {
                max = val;
                win = key;
            }

            else if (val == max && win.compareTo(key) > 0)
                win = key;
        }
        String[] ans=new String[2];
        ans[0] = win;
        ans[1] = Integer.toString(max);
        return ans;
    }
}
