public class Main 
{
  static void myMethod() 
{

  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
  System.out.println("I just got executed!");

}

  public static void main(String[] args) 
{
    myMethod();
    myMethod();
    myMethod();
}

static int plusMethodInt(int x, int y) 
{
  return x + y;
}

static double plusMethodDouble(double x, double y) 
{
  return x + y;
}

public static void main(String[] args)
 {
}