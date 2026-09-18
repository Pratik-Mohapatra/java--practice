package src.datastructures;

public class LL_length {
    public static void length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;


        }
        System.out.println("length of linkedlist is : "+count);
    }
    
}
