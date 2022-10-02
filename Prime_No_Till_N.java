import java.util.*;

class Prime_No_Till_N
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,count;
System.out.print("Enter Number to Print Prime Num. till n :");
n=sc.nextInt();

System.out.println("-----------------------------------------------------------");
System.out.println("Prime numbers are :-");    
    
for(int i=2;i<=n;i++)
{
count = 0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
         	
if(count==2)
{
System.out.print(i+" ");
}
}
}
}
