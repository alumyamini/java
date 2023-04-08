+import java.util.Scanner;
public class CountUpperLower{
public class characters{
public static  void main(String[] args){
//variable declaration
int upper=0,lower=0;//vriable declaration and initialization
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
   
System.out.println("enter the character");
char ch=scan.next().charAt(0);
while(ch!=0)
{
if(ch=='*')
{
break;
}
else
{
continue;
}
}
if(ch>='A' && ch<='Z'){
    upper++;
}
else if(ch>='a' && ch<='z'){
    lower++;
}
else
{
System.out.println("invalid");
}
System.out.println("lowercase letters: "+lower);
System.out.println("uppercase letters: "+upper);
}
}
}