import java.util.Scanner;
public class even_odd_till 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to go till:-");
        Scanner in = new Scanner(System.in);
        int lim = in.nextInt();
        int[] even = even(lim);
        int[] odd = odd(lim);
        System.out.println("There are " + even[0] + " Even numbers till "+ lim + " :-");
        printarr(even,even[0]);
        System.out.println("\nThere are " + odd[0] + " Odd numbers till " + lim + ":-");
        printarr(odd,odd[0]);
    }   

    public static int[] even(int x)
    {
        int index=1;
        int[] arr = new int[x];
        for(int i=1;i<=x;i++)
        {
            if(i %2 == 0)
            {
                arr[index] = i;
                index++;
            }
        }
        arr[0] = index;
        return arr;
    }

    public static int[] odd(int x)
    {
        int index=1;
        int[] arr = new int[x];
        for(int i=1;i<=x;i++)
        {
            if(i %2 != 0)
            {
                arr[index] = i;
                index++;
            }
        }
        arr[0] =index;
        return arr;
    }

    public static void printarr(int[] arr,int size)
    {
        for(int i=1;i<size;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }


}
