class Solution{
    static int minSteps(int D){

        int total = 0, steps = 0;

        while (total < D) {
            total += steps;
            steps++;

        }
        while((total-D)%2!=0){
            total+= steps;
            steps++;
        }

        return steps-1;
    }
}
