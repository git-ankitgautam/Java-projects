import java.util.Scanner;
public class Primes_till 
{
    public static void main(String[] args)
    {
        int j,flag=0;
        System.out.println("Enter the number till you want to find primes:-");
        Scanner in = new Scanner(System.in);
        int lim = in.nextInt();
        in.close();
        System.out.println("Prime numbers till "+lim+ " are:-");
        for(int i=1;i<=lim;i++)
        {
            for(j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    flag++;
                }
            }
            if(flag == 0)
            {
                System.out.print(i + " ");
            }
            else
                flag = 0;
        }
    }   
}
