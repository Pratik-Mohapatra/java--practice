package src.datastructures;

public class PrintLL {
    public static void print(Node head){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;


        }
        System.out.print("null");
    }
    
}
