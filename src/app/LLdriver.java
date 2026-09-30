package src.app;

import src.datastructures.*;

public class LLdriver {
    public static void main(String[] args) {
        int []arr={10,20,30,40};
        Node head=Helper.create(arr);
         PrintLL.print(head);
         System.out.println(" ");
        LL_length.length(head);
        head=src.datastructures.LL_Insertion.Start.addBeggining(head,5);
        PrintLL.print(head);
        System.out.println(" ");
        LL_length.length(head);
        src.datastructures.LL_Insertion.End.end(head,20);
        PrintLL.print(head);
        System.out.println(" ");
        LL_length.length(head);
        src.datastructures.LL_Insertion.Kth.kth(head, 4, 3);
        PrintLL.print(head);
        System.out.println(" ");
        LL_length.length(head);
        head=src.datastructures.LL_Deletion.Start.start(head);
        System.out.println(" ");
        PrintLL.print(head);
        src.datastructures.LL_Deletion.End.end(head);
        System.out.println(" ");
        PrintLL.print(head);
        src.datastructures.LL_Deletion.Kth.kth(head, 3);
        System.out.println(" ");
        PrintLL.print(head);



        
        
    }
    
}
