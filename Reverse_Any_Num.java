import java.util.*;

class Reverse_Any_Num
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int rev=0,rem;
System.out.println("Enter Number : ");
int num1=scan.nextInt();
 
while(num1!=0) 
{
rem= num1%10;
rev=rev*10+rem;
num1 = num1/10;
}
System.out.println("The reverse number is : "+rev);
}
}