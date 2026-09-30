package src.datastructures.LL_Insertion;
import src.datastructures.Node;

public class End {
    public static Node end(Node head,int data){
        src.datastructures.Node newnode = new src.datastructures.Node(data);
        if(head==null)
        {
            return newnode;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        return head;    
    }
    
}
