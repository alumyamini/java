public class ReverseNumberExample
{  
public static void main(String[] args)   
{  
int number, reverse = 0;  
number=new scanner(system.in);
system.out.print("enter number");
if(!scan.hasnextint())
{
   system.out.println("invalid");
}
else{
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}
}  
}  