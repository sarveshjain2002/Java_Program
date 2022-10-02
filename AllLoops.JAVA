class AllLoops
{
public static void main(String[] args) 
{
int x= 10;
forLoop(x);
System.out.println();
whileLoop(x);
System.out.println();

dowhileLoop(x);
}
    
public static void forLoop(int x)
{
System.out.println("Using for loop: ");

for(int i = 0; i <= x; i++)
{
System.out.print(i+" ");
}
}

public static void whileLoop(int x)
{
int i = 0;
System.out.println("\n Using while loop");
while(i <= x)
{
System.out.print(i+" ");
i++;
}
}

public static void dowhileLoop(int x)
{
System.out.println("\n Using do while loop");
int i = 0;

do
{
System.out.print(i+" ");
i++;
}
while(i <= x);
}
}