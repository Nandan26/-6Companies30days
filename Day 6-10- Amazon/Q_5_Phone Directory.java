class Solution{
    static class Node
    {
        HashMap<Character,Node> child;
        boolean end;

        public Node()
        {
            child = new HashMap<Character,Node>();

            for (char i = 'a'; i <= 'z'; i++)
                 child.put(i,null);
      
            end = false;
        }
    }

    static Node root;

    static void insert(String s)
    {
        int len = s.length();
    
        Node itr = root;
        for (int i = 0; i < len; i++)
        {

            Node nextNode = itr.child.get(s.charAt(i));
            if (nextNode == null)
            {

                nextNode = new Node();

                itr.child.put(s.charAt(i),nextNode);
            }
    
            itr = nextNode;
    
            if (i == len - 1){
                itr.end = true;    
            }
                    
        }
    }

    static void insertIntoTrie(String contacts[])
    {
        root = new Node();
        int n = contacts.length;
        for (int i = 0; i < n; i++)
        {
            insert(contacts[i]);
        }
    }
    static void displayContactsUtil(Node curNode,
                                   String prefix,ArrayList<String> res)
    {

        if (curNode.end){
            res.add(prefix);
        }

        for (char i = 'a'; i <= 'z'; i++)
        {
            Node nextNode = curNode.child.get(i);
            if (nextNode != null)
            {
                displayContactsUtil(nextNode, prefix + i, res);
            }
        }
    }    
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {

        insertIntoTrie(contact);
        
        ArrayList<ArrayList<String>> res =new ArrayList<>();
        Node prevNode = root;
        String prefix = "";
        int len = s.length();
        int i;
        for (i = 0; i < len; i++)
        {
            ArrayList<String> ans=new ArrayList<>();
            
            prefix += s.charAt(i);

            char lastChar = prefix.charAt(i);
 
            Node curNode = prevNode.child.get(lastChar);
 
            if (curNode == null)
            {
                ans.add("0");
                res.add(ans);
                i++;
                break;
            }

            displayContactsUtil(curNode, prefix, ans);
            
            res.add(ans);
            prevNode = curNode;
        }
        while(i<len){
            ArrayList<String> zero=new ArrayList<>();
            zero.add("0");
            res.add(zero);
            i++;
        }
        return res;

        
    }
    
}
