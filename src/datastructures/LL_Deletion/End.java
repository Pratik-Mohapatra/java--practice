package src.datastructures.LL_Deletion;
import src.datastructures.Node;
public class End {
    public static Node end(Node head){
        if (head==null)
        {
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;

        }
        temp.next=null;
        return head;
    }
    
}
