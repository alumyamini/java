import java.util.Scanner;
public class Sum
{  
public static void main(String[] args)   
{  
int i, num , sum = 0; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit:");
num=sc.nextInt(); 
//executes until the condition returns true 
while(num!=0){ 
if(num>0){
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
}
else if(num<0){
for(i=1;i<=num;i--){
sum=sum+i;
}
}
else{
     System.out.println("invalid");
}
}
//prints the sum   
System.out.println("Sum of First n Natural Numbers is = " + sum); 
} 
} 