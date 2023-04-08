import java.util.*;
import java.lang.*;
import java.io.*;
public class cont {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
System.out.println("enter the number of characters");
int n=sc.nextInt();
System.out.println("enter character:");
for(i=0;i<=n;i++){
char charSearch=sc.next().charAt(i);
}
        for(int i=0; i<str.length(); i++) 
        {
            char chr = str.charAt(i);
                if(charSearch== chr)
                {
                    System.out.println("Char Value "+charSearch+" is present in "+str);      
                } 
        }
    }
}