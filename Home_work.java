public class Home_work {
    public static void main(String[] args) {
        //sum of 10 numbers 
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum = sum+i;

        }
        System.out.println("sum of 10 numbers is : "+sum);

        //sum of first 10 even numbers 

        int addition =0;
        for(int i=1;i<=10;i++)
        {
            if (i%2==0)
            {
                addition=addition+i;
            }
        }
        System.out.println("sum of 1st 10 even numbers is : "+addition);

        //sum of even numbers between 20 and 40 including both
        int output=0;

        for(int i=20;i<=40;i++)
        {
            if(i%2==0)
            {
                output=output+i;

            }
            
        }
        System.out.println("sum of even numbers between 20 and 40 is : "+output);
    }
    
}
