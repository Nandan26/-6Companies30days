/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
        str = str.trim();
        if (str.isEmpty())
            return 0;
        int s = 1;
        int i = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+'){
            s = (str.charAt(0) == '-')? -1 : 1;
            if (str.length() < 2 || !Character.isDigit(str.charAt(1))) {
                return 0;
            }
            i++;
        }
        int n = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                int d = str.charAt(i) - '0';
                if (n > (Integer.MAX_VALUE - d) / 10) {
                    n = (s == -1)? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    return n;
                }
                n = n*10 + d;
            } else {
                return -1;
            }
            i++;
        }
        return s * n;
    }
}
