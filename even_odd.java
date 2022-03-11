import java.util.Scanner;
public class even_odd 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to check:-");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        if(num % 2 ==0)
            System.out.println(num +" is an even number");
        else 
            System.out.println(num + " is an odd number");
    }
    
}
