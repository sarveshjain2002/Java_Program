//WRITE A JAVA PROGRAM TO FIND THE FACTORIAL OF GIVEN NUMBER

import java.util.*;

class Factorial_Any_Num
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int num=10;
int fact;

System.out.println("Enter a Number for Factorial: ");
fact=scan.nextInt();


for(int i=1;i<=num;i++)
{
fact=fact*i;

System.out.println("The factoial " + num +" is: " +fact);
}

}
}