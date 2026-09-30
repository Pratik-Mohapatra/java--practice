package src.datastructures.LL_Deletion;
import src.datastructures.Node;

public class Start {
    public static Node start(Node head){
        if(head==null)
        {
            return null;

        }
        return head.next;
    }
}
