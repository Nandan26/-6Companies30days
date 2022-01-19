class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            while(!ans.isEmpty() && ans.get(ans.size()-1)<arr[i]){
                ans.remove(ans.size()-1);
            }
            ans.add(arr[i]);
        }
        return ans;
    }

}
