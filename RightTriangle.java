import java.util.Scanner;

public class RightTriangle {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		
		System.out.print("Enter Right Angled Triangle Pattern Rows = ");
		int rows = sc.nextInt();
                                      System.out.print("enter the character:");
                                       char c=sc.next().charAt(0);
		
		System.out.println("Printing Right Angled Triangle Star Pattern");
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}