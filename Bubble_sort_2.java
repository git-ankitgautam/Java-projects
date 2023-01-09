import java.util.Scanner;
public class Bubble_sort 
{
    public static void main(String[] args)
    {
        int temp =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element of array:-");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements one by one:-");
        for(int i=0;i<size;i++)
        {
            array[i] = in.nextInt();
        }
        in.close();

        for(int i=0; i < size; i++)
        {  
            for(int j=1; j < (size-i); j++)
            {  
                if(array[j-1] > array[j])
                {  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp; 
                }
            }
        }

        System.out.println("sorted array:-");
        for(int  i=0;i<size;i++)
        {
            System.out.print(array[i] + " ");
        }
    }   
}
