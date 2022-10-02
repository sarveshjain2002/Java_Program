import java.util.*;

class Looping_Statements_2
{
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number: ");
int a = scan.nextInt();

System.out.println("Enter a Number: ");
int b = scan.nextInt();

System.out.println("Enter a Number: ");
int c = scan.nextInt();

System.out.println("-------------------------------------------");

forLoop(a);
System.out.println();
whileLoop(b);
System.out.println();
dowhileLoop(c);
}
    
public static void forLoop(int a)
{
System.out.println("Using for loop: ");

for(int i = 0; i <= a; i++)
{
System.out.print(i+" ");
}
}

public static void whileLoop(int b)
{
int i = 0;
System.out.println("\n Using while loop");
while(i <= b)
{
System.out.print(i+" ");
i++;
}
}

public static void dowhileLoop(int c)
{
System.out.println("\n Using do while loop");
int i = 0;

do
{
System.out.print(i+" ");
i++;
}
while(i <= c);
}
}