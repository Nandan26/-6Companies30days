/*Complete the function below*/
class GfG
{
    public int missingNumber(String s) {
        if(s.length() == 1) {
            return -1;
        }

        for(int i = 1; i <= Math.min(6, s.length()); i++) {

            int curr = Integer.parseInt(s.substring(0,i));
            int ans = misshelper(s.substring(i), curr, false);
            if(ans != -1) {
                return ans;
            }
        }
        return -1;

    }

    private static int misshelper(String str, int val, boolean bool) {
        if(str.equals("")) {
            if(bool) {
                return 0;
            }
            return -1;
        }
        if(bool) {
            String curr = "" + (val + 1);
            if(str.startsWith(curr)) {
                return misshelper(str.substring(curr.length()), val + 1, bool);
            } else {
                return -1;
            }
        } else {
            String curr = "" + (val + 1);
            if(str.startsWith(curr)) {
                return misshelper(str.substring(curr.length()), val + 1, bool);
            } else {
                curr = (val + 2) + "";
                if(str.startsWith(curr)) {
                    if( misshelper(str.substring(curr.length()), val + 2, true) == 0) {
                        return val + 1;
                    }
                }
                return -1;
            }
        }
    }
}
