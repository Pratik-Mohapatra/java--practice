package src.app;

import src.datastructures.*;

public class LLdriver {
    public static void main(String[] args) {
        int []arr={10,20,30,40};
        Node head=Helper.create(arr);
        PrintLL.print(head);
        System.out.println(" ");
        LL_length.length(head);
        
        
    }
    
}
