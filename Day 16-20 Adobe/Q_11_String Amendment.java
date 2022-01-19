class Solution{
    public String amendSentence(String s){
        char[] str=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0; i < str.length; i++)
        {

            if (str[i]>='A' && str[i]<='Z')
            {
                str[i] = (char)(str[i]+32);

                if (i != 0)
                    sb.append(" ");

                sb.append(str[i]);
            }

            else    sb.append(str[i]);
        }
        return sb.toString();
    }
}
