class Solution
{
    public String FirstNonRepeating(String A)
    {

        int[] freq = new int[26];
        StringBuilder sb=new StringBuilder();
        Queue<Character> q = new LinkedList<Character>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            q.add(ch);

            
            freq[ch - 'a']++;

            while (!q.isEmpty()) {
                if (freq[q.peek() - 'a'] > 1)
                    q.remove();
                else {
                    sb.append(q.peek());
                    break;
                }
            }
            if (q.isEmpty())
                sb.append('#');
        }
        return sb.toString();

    }
}
