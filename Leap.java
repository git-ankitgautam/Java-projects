import java.util.Scanner;
public class Leap 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the year you want to check:-");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        in.close();
        if(year %4 == 0)
        {
            if(year % 100 == 0 && year %400 != 0)
                System.out.println(year + " is not leap year");
            else
                System.out.println(year + " is a leap year");
        }
        else
            System.out.println(year + " is not a leap year");
    }
    
}
