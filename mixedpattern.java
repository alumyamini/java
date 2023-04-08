import java.util.Scanner;
import java.util.*;
public class patternmix
{
       public static void main(String[] args)
        {
           try
            {
                Scanner sc=new Scanner(System.in);
                Scanner s=new Scanner(System.in);
                System.out.print("enter the choice:");
                int choice=sc.nextInt();
                System.out.print("enter the rows:");
                int rows=sc.nextInt();
                switch(choice)
                {
                    case 1:
                                  for (int i = 1; i <= rows; i++) {
                                 for (int j = 1; j <= i; j++) {
                                 System.out.print(i + " ");
                                  }
                               System.out.println();
                               }
                                break;
                       case 2:
                              for (int i = 1; i <= rows; i++)   
                                {  
                                       for (int j = 1; j <= i; j++) 
                                        {
                                            System.out.print(1+" ");
                                        }   
                                      System.out.println();   
                                }   
                             for (int i = rows-1; i >= 1; i--)  
                                {  
                                   for (int j = 1; j <= i; j++)
                                      {
                                           System.out.print(1+" ");  
                                      }
                                   System.out.println();  
                               } 
                            break;
                      case 3:
                                int k;
                               for (int i = 1; i <= rows; i++)
                                  {
                                    for (int j = rows; j > i; j--)
                                       {
                                         System.out.print(" ");
                                        }
                                       int temp= 1;
                                       for ( k = 1; k <= i; k++)
                                         {
                                            System.out.print(temp + " ");
                                              temp = temp * (i - k) / (k);
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
                    System.out.print("invalid input");
               }
      }
}
                         