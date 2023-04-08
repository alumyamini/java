import java.util.Scanner;
public class numPattern 
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);  
System.out.println("how many rows");
int rows=sc.nextInt();
for (int i = 1; i <= rows; i++)   
{  
for (int j = 1; j <= i; j++) 
{
System.out.print(j+" ");
}   
System.out.println();   
}   
//prints lower half pattern  
for (int i = rows-1; i >= 1; i--)  
{  
for (int j = 1; j <= i; j++)
{
System.out.print(j+" ");  
}
System.out.println();  
} 
sc.close(); 
}  
}