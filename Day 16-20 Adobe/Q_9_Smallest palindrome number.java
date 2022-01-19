class Solution
{
    public String nextPalin(String N)
    {
        //complete the function here
        int n=N.length();
        char[] num=N.toCharArray();
        if (n <= 3) {
            return "-1";
        }

        int mid = n / 2 - 1;
        int i, j;
        int flag=0;

        for (i = mid - 1; i >= 0; i--){
            if (num[i] < num[i + 1]){
                flag=1;
                break;
            }
        }

        if (flag == 0) {
            return "-1";
        }

        int small = i + 1;
        for (j = i + 2; j <= mid; j++){
            if (num[j] > num[i] && num[j] <= num[small])
                small = j;
        }

        char temp;

        temp = num[i];
        num[i] = num[small];
        num[small] = temp;

        temp = num[n - i - 1];
        num[n - i - 1] = num[n - small - 1];
        num[n - small - 1] = temp;


        reverse(num, i + 1, mid);

        if (n % 2 == 0) reverse(num, mid + 1, n - i - 2);

        else    reverse(num, mid + 2, n - i - 2);


        String res=String.valueOf(num);

        return res;
    }
    public static void reverse(char num[], int i,int j)
    {
        while (i < j) {
            char temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
    }
}
