import java.util.Scanner;
public class Bubble_sort 
{
    public static void main(String[] args)
    {
        int temp =0,j=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element of array:-");
        int size = in.nextInt();
        in.close();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = in.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
            j=0;
            while(j < size -i-1)
            {
                
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                j++;
            }
        }

        System.out.println("sorted array:-");
        for(int  i=0;i<size;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
}
