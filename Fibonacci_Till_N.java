import java.util.Scanner;

class Fibonacci_Till_N 
{
public static void main(String[] args) 
{
int  a = 0, b = 0, c = 1;

Scanner scan = new Scanner(System.in);

System.out.print("Enter value of n:");
       
int n = scan.nextInt();
        
System.out.print("Fibonacci Series:");
        
for(int i = 1; i <= n; i++)
{
a = b;
b = c;
c = a + b;
 
System.out.print(a+" ");
}
}
}