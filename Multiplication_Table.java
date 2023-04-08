import java.util.Scanner;
public class Multiplication_Table 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number m:");        
	int m=s.nextInt();
                   System.out.print("enter number n:");
                   int n=s.nextInt();
        for(int i=1; i <= n; i++)
        {
            System.out.println(m+" * "+i+" = "+m*i);
        }
    }
}