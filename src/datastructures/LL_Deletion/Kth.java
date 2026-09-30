package src.datastructures.LL_Deletion;
import src.datastructures.Node;

public class Kth {
    public static Node kth(Node head,int k){
    if (k<=1||head ==null)
        {
            
            return null;
        }
        Node current=head;
        for(int i=1;i<k-1&&current.next!=null;i++)
        {
            current=current.next;
        }
            
            current.next=current.next.next;

        

        return head;
    }
    
}
