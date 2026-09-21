package src.datastructures.LL_Insertion;
import src.datastructures.Node;

public class Start {
    public static Node addBeggining(Node head,int data){

       src.datastructures.Node newnode = new src.datastructures.Node(data);
        newnode.next=head;
        return newnode;
        
    }
    
}
