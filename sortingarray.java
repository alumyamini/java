import  java.util.Scanner;
import java.util.Arrays;
public class sortingarray
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("enter the number of strings:");
int n=s.nextInt();
String str[]=new String[n];
System.out.print("enter the strings:");
for(int i=0;i<n;i++)
{
str[i]=s.nextLine();
}
int size=str.length;
for(int i=0;i<size-1;i++)
{
for(int j=i+1;j<str.length;j++)
{
if(str[i].compareTo(str[j])>0)
{
String temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println(Arrays.toString(str));
}
}