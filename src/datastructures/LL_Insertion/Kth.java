package src.datastructures.LL_Insertion;
import src.datastructures.Node;

public class Kth {
    public static Node kth(Node head, int data, int k){
        src.datastructures.Node newnode = new src.datastructures.Node(data);
        if (k<=1||head ==null)
        {
           
            newnode.next=head;
            return newnode;
        }
        Node current=head;
        for(int i=1;i<k-1&&current.next!=null;i++)
        {
            current=current.next;
        }
           
            newnode.next=current.next;
            current.next=newnode;

        

        return head;
    }
    
    
}
