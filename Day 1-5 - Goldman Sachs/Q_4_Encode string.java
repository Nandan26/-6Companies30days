//Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string. eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
class GfG
{
  String encode(String str)
	{
        StringBuilder sb=new StringBuilder();
        int n = str.length();
        int count = 1;
        for (int i = 1; i < n; i++) {

            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }

        }
        sb.append(str.charAt(n-1));
        sb.append(count);
        return sb.toString();
	}
	
}
