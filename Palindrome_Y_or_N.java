import java.util.*;

class Palindrome_Y_or_N
{  
 public static void main(String args[]){  
  int rev,sum=0,temp; 

Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number to Check : ");
int n = scan.nextInt();

temp=n;    
while(n>0)
{    
rev=n%10;    
sum=(sum*10)+rev;    
n=n/10;    
}    
  
if(temp==sum)    
{
System.out.println("---------------------------------------------- ");  
System.out.println("The Entered Number is Palindrome : "+temp);    
}
else    
{   

System.out.println("---------------------------------------------- ");
System.out.println("The Entered Number is not Palindrome :"+temp);    
} 
}  
}