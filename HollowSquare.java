import java.util.Scanner;

public class HollowSquare{
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Square Side = ");
		int side = sc.nextInt();
                                      System.out.print("enter the character or number:");
                                      char c=sc.next().charAt(0);
		
		System.out.println("Printing Hollow Square Star Pattern");
		
		for (int i = 0; i < side; i++ ) 
		{
			for (int j = 0 ; j < side; j++ ) 
			{
				if (i == 0 || i == side - 1 || j == 0 || j == side - 1) 
	                                                         {
					System.out.print(c+"");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}