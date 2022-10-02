/*WAP which uses local, instance & static keyword along with 
this keyword(used as reference of the current object).*/


class CSE_Dept
{  
int rollno;					//Instance variable  is Used
String name;
float fee;  
static String college ="CSE";			//Static Variable is Used


CSE_Dept(int r, String n, float f)		//Constructor Is Used
{  
   this.rollno = r;  
   this.name = n;  
   fee= f;
}  

void display ()
{
System.out.println(rollno+" "+name+" "+college+" "+fee);
}  
}  

class Section
{   
public static void main(String args[])
{  

 System.out.println("-----------------------------------------");
 CSE_Dept s1 = new CSE_Dept (1,"Sarvesh",5000f);
 s1.display();  

 System.out.println("-----------------------------------------"); 
 CSE_Dept s2 = new CSE_Dept (2,"Pranav",2000f);  
 s2.display();  

 System.out.println("-----------------------------------------");
 CSE_Dept s3 = new CSE_Dept (3,"Prathmesh",3000f); 
 s3.display();  

 System.out.println("-----------------------------------------");
 CSE_Dept s4 = new CSE_Dept (4,"Nikhil",1000f);  
 s4.display();  
  
 System.out.println("-----------------------------------------");
 CSE_Dept s5 = new CSE_Dept (5,"Sakshi",6000f);
 s5.display();  

 System.out.println("-----------------------------------------");
 CSE_Dept s6 = new CSE_Dept (6,"Janhvi",7000f);
 s6.display();  

 System.out.println("-----------------------------------------");


 }  
} 