class Solution
{
    String colName (long n)
    {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int rem =(int) n % 26;

            if (rem == 0) {
                sb.append("Z");
                n = (n / 26) - 1;
            }
            else
            {
                sb.append((char)((rem - 1) + 'A'));
                n = n / 26;
            }
        }
        return sb.reverse().toString();

    }
}
