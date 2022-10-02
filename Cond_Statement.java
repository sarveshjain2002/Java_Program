// WAP which contains all types of Conditional Statements. (Single Program)

import java.util.*;

class Cond_Statement
{
public static void main(String args[])
{
int day;
Scanner scan = new Scanner(System.in);

System.out.println("Enter the number: ");
int a=scan.nextInt();

if(a>=4)
{
System.out.println("QUALIFIER  : "+a );
}
	if(a>=6)
	{
	System.out.println("SEMI-FINAL  : "+a );
	}
	else if(a>=10)
	{
	System.out.println("FINAL: "+a);
	}

else
{
System.out.println("LOSE : "+a );
}

switch(day = a)
{
case 1: 
System.out.println("HAVE A NICE DAY : " );
break;

case 2: 
System.out.println("HAVE A GREAT DAY : ");
break;

case 3: 
System.out.println("HAVE A AMAZING DAY : ");
break;

case 4: 
System.out.println("BEST OF LUCK : ");
break;

case 5: 
System.out.println("ALWAYS TRY YOUR BEST : ");
break;

case 6: 
System.out.println("THAT'S A GREAT !!! LOGIC : ");
break;

case 7: 
System.out.println("HAVE A AMAZING DAY : ");
break;

default:
System.out.println("Invalid: ");
}
}
}