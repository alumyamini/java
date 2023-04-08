import java.util.*;
import java.io.IOException;
public class str_op
{
  	public static void main(String[] args) 
	{
		try
		{
			String str;
			int ch;
			int strLength;
			String reverseStr = "";
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			System.out.print("Enter choice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					if (!str.matches("[A-Za-z]+"))
					{
     	    					System.out.println ("Invalid Input");
            				System.exit(1);
        				}
					strLength = str.length();
    					for (int i = (strLength - 1); i >=0; --i) 
					{
      					reverseStr = reverseStr + str.charAt(i);
    					}
    					if(str.toLowerCase().equals(reverseStr.toLowerCase())) 
					{
      					System.out.println(str + " is a Palindrome String.");
    					}
    					else 	
					{
      					System.out.println(str + " is not a Palindrome String.");
    					}
					break;	
				case 2:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					if (!str.matches("[A-Za-z]+"))
					{
     	    					System.out.println ("Invalid Input");
            				System.exit(1);
        				}
					strLength = str.length();
    					for (int i = (strLength - 1); i >=0; --i) 
					{
      					reverseStr = reverseStr + str.charAt(i);
    					}
    					System.out.println("Reverse of given string = "+reverseStr);
					break;
				case 3:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					String[] splitString = str.split(" ");
					/*for (String z : splitString) 
					{
 						System.out.println(z);
					}*/
					System.out.println("Sub strings are: ");  
					System.out.println(Arrays.toString(splitString));  
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