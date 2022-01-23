class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;



        while(start<end){
            int mid=start+ (end-start)/2;
            if (target == mountainArr.get(mid)) return mid;
            if(mountainArr.get(mid)<mountainArr.get((mid+1)%l)){
                if(target<mountainArr.get(mid)){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (target>mountainArr.get(mid)){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

    }
}
