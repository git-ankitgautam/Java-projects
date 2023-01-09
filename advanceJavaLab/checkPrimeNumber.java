import java.util.Scanner;

public class checkPrimeNumber 
{
    public static void main(String[] args)
    {
        int i,num,flag=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check:-");
        num = input.nextInt();
        input.close();
        for(i=2; i<=num/2;i++)
        {
            if(num% i == 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            System.out.println(num + " is not a prime number");
        else
            System.out.println(num + " is a prime number");
    }
}
