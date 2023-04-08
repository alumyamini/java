import java.util.Scanner;
import java.util.*;
public class patternmix
{
public static void main(String[] args)
   {
     try{
     Scanner sc=new Scanner(System.in);
     System.out.print("......................................\n");
     System.out.print("1.rightangledtriangle\n 2.invertedpyramid\n 3.hollowsquare\n");
     System.out.print(".....................................\n");
     System.out.print("Enter Rows = ");
     int rows = sc.nextInt();
      System.out.print("enter the character or number:");
      char c=sc.next().charAt(0);
		
     System.out.print("enter the choice:");
     int choice=sc.nextInt();
     
     switch(choice) 
      {
          case 1:
		
		System.out.println("Printing Right Angled Triangle Star Pattern");
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(c);
			}
			System.out.println();
		}
                    break;
               case 2:
              int  i=rows,j;
	while(i>0)
               { j=0;
                    while(j++<rows-i)
                       {
                               System.out.print(" "); 
                       }
                    
	         j=0;
                       while(j++<(i*2)-1)
                
                       {
                               System.out.print(c); 
                       }
                     System.out.println();
                     i--;
 
               }             
            break;
         case 3:
		System.out.println("Printing Hollow Square Star Pattern");
		
		for ( i = 0; i < rows; i++ ) 
		{
			for ( j = 0 ; j < rows; j++ ) 
			{
				if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) 
	                                                         {
					System.out.print(c);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
                                break;
             default:
               break;
       }
  }
 catch(Exception e)
		{
			System.out.print("Invalid Input");
			return;
		}
}
}