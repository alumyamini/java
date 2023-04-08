package cf.java.String;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
public class stringoperation
{
      public static void main(String[] args)
        {
            try
              {
                 String str1,str2,c,ch,st;
                   System.out.print("...............................\n");
                   System.out.print("1.anagrams 2.length 3.upper and lower 4. vowels and consonants\n");
                   System.out.print("........................................\n");
                   Scanner sc=new Scanner(System.in);
                  Scanner s=new Scanner(System.in);
                   System.out.print("enter the choice:");
                   int n=s.nextInt();
                   switch(n)
                   {
                        case 1:
                                   
                                     System.out.print("enter the string 1:");
                                     str1=sc.nextLine();
                                     System.out.print("enter the string 2:");
                                      str2=sc.nextLine();
                                   str1 = str1.toLowerCase();
                                   str2 = str2.toLowerCase();

                               if(str1.length() == str2.length())
                                {
                                    char[] charArray1 = str1.toCharArray();
                                     char[] charArray2 = str2.toCharArray();
                                    Arrays.sort(charArray1);
                                    Arrays.sort(charArray2);
                                   boolean result = Arrays.equals(charArray1, charArray2);

                                   if(result)
                                    {
                                       System.out.println(str1 + " and " + str2 + " are anagram.");
                                    }
                                    else                
                                    {
                                        System.out.println(str1 + " and " + str2 + " are not anagram.");
                                    }
                                }
                          else 
                           {
                               System.out.println(str1 + " and " + str2 + " are not anagram.");
                            }
                       break;
                   case 2:
                             
                            System.out.println("enter the string:");
                             ch=sc.nextLine();
                             System.out.println("string length is: "+ch.length());
                             break;
                   case 3:
                           
                           System.out.print("enter the string:");
                            st=sc.nextLine();
                             String lowerCaseString="",upperCaseString="";
		lowerCaseString= st.toLowerCase();  
		upperCaseString= st.toUpperCase();  
		System.out.println("Original String: "+st);
		System.out.println("Lower Case String: "+lowerCaseString);
		System.out.println("Upper Case String: "+upperCaseString);
                                  break;
                      case 4:
                                
                                int v=0,co=0;
                               System.out.print("Enter any String: ");
                                c = sc.nextLine();
		c = c.toLowerCase();
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'a' || c.charAt(i) == 'e' || c.charAt(i) == 'i' || c.charAt(i) == 'o'
					|| c.charAt(i) == 'u') {
				
                                                                   v++;
                                                                    System.out.print("\n vowels in string are " + c.charAt(i));
                                                          }
                                                         else if(c.charAt(i)>='a' && c.charAt(i)<='z'){
                                                                     co++;
                                                                      System.out.print(" \n consonants in string are:" +c.charAt(i));
                                                           
			}
                                                        else{
                                                                  System.out.print("\n invalid");
                                                        }
                                                 }
                                                 System.out.print("\nnumber of vowels:"+v);
                                                 System.out.print("\n number of consonants:"+c);
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