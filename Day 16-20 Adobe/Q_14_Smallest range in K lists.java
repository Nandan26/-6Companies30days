class Solution
{

    static int[] findSmallestRange(int[][] KSortedArray,int n,int k)
    {
        int[] res = {0,1000000};
        int max = Integer.MIN_VALUE;

        class compare implements Comparator<int[]>
        {
            public int compare(int[] ar1 , int[] ar2){
                return ar1[0] - ar2[0];
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new compare());


        for(int i=0 ;i<k;i++){
            int val = KSortedArray[i][0];
            int[] temp = {val , 0 , i};
            max = Math.max(max , val);
            pq.add(temp);
        }

        while(true){
            int[] min = pq.poll();
            if(res[1] - res[0] > max - min[0]){
                res[1] = max;
                res[0] = min[0];
            }
            min[1]++;
            if(min[1] == n)
                break;
            if(KSortedArray[min[2]][min[1]] > max){
                max = KSortedArray[min[2]][min[1]];
            }
            int temp[]  = {KSortedArray[min[2]][min[1]] , min[1] , min[2]};
            pq.add(temp);
        }

        return res;
    }
}
