import java.util.Scanner;
public class Input 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        a = input.nextInt();
        System.out.println("Enter the second number:-");
        b = input.nextInt();
        input.close();
        c = a+b;
        System.out.println("Sum = " + c);
    }
}
