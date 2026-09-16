import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num=20;
        if (num%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");

        } 
       
       System.out.println("enter the age of the voter :");
       int age = sc.nextInt();
       if (age>=18 && age<=35)
       {
        System.out.println("voter is eligible for updates in the resident area X");

       }
       else
       {
        System.out.println("voter is not eligible please update your voter ID");


       }
        
       int z =10;
       if (z!=10)
       {
        System.out.println("ture");
    
       }
       else
       {
        System.out.println("false");
       }
       
     if(10!=0)
     {
        System.out.println("true");
     }
     else
     {
        System.out.println("false");
     }
        
       System.out.println("enter a : ");
       int a = sc.nextInt();
       System.out.println("enter b : ");
       int b = sc.nextInt();
       System.out.println("enter c : ");
       int c = sc.nextInt();

      if (a > b && a > c) {
            System.out.println("a is largest");
            if (b > c) {
                System.out.println("b is 2nd largest");
                System.out.println("c is smallest");
            } else {
                System.out.println("c is 2nd largest");
                System.out.println("b is smallest");
            }
        } else if (b > a && b > c) {
            System.out.println("b is largest");
            if (a > c) {
                System.out.println("a is 2nd largest");
                System.out.println("c is smallest");
            } else {
                System.out.println("c is 2nd largest");
                System.out.println("a is smallest");
            }
        } else if (c > a && c > b) {
            System.out.println("c is largest");
            if (a > b) {
                System.out.println("a is 2nd largest");
                System.out.println("b is smallest");
            } else {
                System.out.println("b is 2nd largest");
                System.out.println("a is smallest");
            }
        } else {
           
            System.out.println("error!!!");

    }
}
    
}
