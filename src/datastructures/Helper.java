package src.datastructures;

public class Helper {
    public static Node create(int[] Helper){
        if(Helper==null||Helper.length==0){
             return null;
        }
        Node head=new Node(Helper[0]);
        Node current=head;
        
        for(int i=1;i<Helper.length;i++)

        {
            Node newNode=new Node(Helper[i]);
            current.next=newNode;
            current=newNode;

        }
        return head;


    }
    
}
