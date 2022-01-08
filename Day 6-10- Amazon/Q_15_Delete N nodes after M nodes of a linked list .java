class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        int cnt;
        if(head==null) return;
        Node curr = head;
        Node temp;
        

        while (curr!=null) 
        { 
            cnt=1; 
            while(cnt < M && curr != null){
                curr = curr.next;
                cnt++;
            } 

            if (curr == null) 
                return; 

            temp = curr.next; 
            cnt=1;
            while (cnt <= N && temp != null) 
            { 
             
                temp = temp.next; 
                cnt++;
            } 

            curr.next = temp; 

            curr = temp;
            
        } 
    } 
}
