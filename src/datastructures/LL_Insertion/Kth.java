package src.datastructures.LL_Insertion;
import src.datastructures.Node;

public class Kth {
    public static Node kth(Node head, int data, int k){
        if (k<=1||head ==null)
        {
            src.datastructures.Node newnode = new src.datastructures.Node(data);
            newnode.next=head;;
            return head;
        }
        Node current=head;
        for(int i=1;i<k-1&&current.next!=null;i++)
        {
            current=current.next;
        }
            src.datastructures.Node newnode =new src.datastructures.Node(data);
            newnode.next=current.next;
            current.next=newnode;

        

        return head;
    }
    
    
}
