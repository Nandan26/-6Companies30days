class Solve {
    int[] findTwoElement(int arr[], int n) {
        int i=0;
        int[] ans=new int[2];
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else i++;
            }
            else i++;
        }
        for(int id=0;id<arr.length;id++){
            if(arr[id]!=id+1){
                ans[0]=arr[id];
                ans[1]=id+1;
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
