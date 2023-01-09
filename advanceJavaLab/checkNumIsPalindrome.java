import java.util.Scanner;

public class checkNumIsPalindrome {
    
    public static void main(String args[])
    {
        int temp, num, rem,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:-");
        num = input.nextInt();
        input.close();
        temp = num;
        while(num>0)
        {    
            rem=num%10;  
            sum=(sum*10)+rem;    
            num/=10;
        }

        if(temp == sum)    
            System.out.println(temp + " is a palindrome number ");    
        else    
            System.out.println(temp + "is not palindrome");     

    }
}
