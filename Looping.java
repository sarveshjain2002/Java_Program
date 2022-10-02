import java.util.*;


class Looping
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter a Number: ");
int  a= scan.nextInt();

System.out.println("Enter a Number: ");
int  b= scan.nextInt();

System.out.println("----------------------------");
 
for(int i=1;i<=10;i++)
{  
System.out.println(i);
}  

 
while(a<=10)
{  
System.out.println(a);
a++;  
}

    
do
{    
System.out.println(b);     
b++;    
}
while(b<=10);      
}
}