import java.util.Scanner;

public class fibonacci 
{
    public int fibonacci(int t)
    {
        if ( t == 0 )
            return 0;
        else if ( t == 1 )
            return 1;
        else
            return ( fibonacci(t-1) + fibonacci(t-2));
    }

    public void main(String[] args)
    {
        int i=0,num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:-");
        num = input.nextInt();
        input.close();
        System.out.println("Fibonacci series:-");
        for (i=0;i<num;i++)
        {  
            System.out.println(fibonacci(i));
        }
        
    }  
}
