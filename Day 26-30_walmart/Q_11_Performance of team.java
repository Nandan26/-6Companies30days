class Solution {
    int mod = 1000000007;
    class Pair implements Comparable<Pair>{
        int speed;
        int efficiency;
        public Pair(int speed , int efficiency){
            this.speed=speed;
            this.efficiency = efficiency;
        }
        public int compareTo(Pair other){
            return other.efficiency-this.efficiency;
        }
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        Pair arr[] = new Pair[n];
        for(int i=0;i<n;i++){
            arr[i] = new Pair(speed[i],efficiency[i]);
        }
        Arrays.sort(arr);

        PriorityQueue<Integer> pq = new PriorityQueue();
        long total = 0;
        long ans = Long.MIN_VALUE;

        for(Pair p : arr){
            if(pq.size()<k){
                pq.add(p.speed);
                total+=p.speed;
            }else{
                total-=pq.remove();
                pq.add(p.speed);
                total+=p.speed;
            }
            ans = Math.max(ans,total*p.efficiency);
        }

        return  (int)(ans%mod);
    }
}
Q-6
class Solution
{
    int mod=1000000007;
    long power(int N,int R)
    {
        return helper(N,R)%mod;

    }

    long helper(int N,int R){
        if (N == 0)
            return 0;

        if (R == 0)
            return 1;

        long y;
        if (R % 2 == 0) {

            y = helper(N, R/2);
            y = (y * y) % mod;
        }

        else {
            y = N % mod;

            y = (y * helper(N, R - 1) % mod) % mod;
        }

        return ((y + mod) % mod);
    }

}
