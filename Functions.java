public class Functions {
     public static String hello()
    {
        return "hello bro!!!";
    }
        

    public static int sum(int n)
    {
        if (n==0)
        {
            return 0;
        }
        int sum=(n*(n+1))/2;
        return sum;
    }
    public static void main(String[] args) {

       System.out.println(hello());
       System.out.println(sum(0));
       System.out.println(sum(10));
        
    }
    
}
