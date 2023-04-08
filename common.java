import java.util.Scanner;
import java.util.Arrays; 
public class common {
public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
         int n = s.nextInt();
        int array1[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            array1[i] = s.nextInt();
        }
        int array2[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            array2[i] = s.nextInt();
        }
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}