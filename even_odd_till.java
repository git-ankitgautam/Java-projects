import java.util.Scanner;
public class even_odd_till 
{
    public static void main(String[] args)
    {
        int index = 1;
        System.out.println("Enter the number you want to go till:-");
        Scanner in = new Scanner(System.in);
        int lim = in.nextInt();
        int[] even = new int[(lim/2)+1];
        for(int i=1;i<=lim;i++)
        {
            if(i %2 == 0)
            {
                even[index] = i;
                index++;
            }
        }
        even[0] = index;
        System.out.println("There are " + even[0] + " Even numbers till "+ lim + " :-");
        printarr(even,even[0]);
        index = 1;
        int[] odd = new int[(lim/2)+1];
        for(int i=1;i<=lim;i++)
        {
            if(i %2 != 0)
            {
                odd[index] = i;
                index++;
            }
        }
        odd[0] = index;
        System.out.println("\nThere are " + odd[0] + " Odd numbers till " + lim + ":-");
        printarr(odd,odd[0]);
    }   

    public static void printarr(int[] arr,int size)
    {
        for(int i=1;i<size;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }


}
