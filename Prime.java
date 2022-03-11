import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter the number you want to check:-");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        for(i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                break;
            }
        }
        if(i==num/2)
            System.out.println(num + " is prime number");
        else
            System.out.println(num +" is not a prime number");
    }
    
}
