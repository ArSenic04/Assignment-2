import java.util.Scanner;	
public class q5
{	
void record(String t )	
{	
System.out.println(t);	
}	
void record(String studentName,char grade)	
{	
System.out.println("Student name is "+studentName);	
System.out.println("Student grade is "+grade);	
}	
void record(int id,String studentName,char grade)	
{	
System.out.println("Student ID is "+id);	
System.out.println("Student name is "+studentName);	
System.out.println("Student grade is "+grade);	
}	
public static void main(String[]args)	
{
    q5 O =new q5();
    Scanner ob=new Scanner(System.in); System.out.println("Enter the record of Students:"); String name=ob.next();
    String a=ob.next(); int ID=ob.nextInt();
    char gd=ob.next().charAt(0); System.out.println("string is:"); O.record(a);
    System.out.println("Enter a Student name and grade:");
    O.record(name,gd);
    System.out.println("Enter a id and name and grade:"); O.record(ID,name,gd);
    
    //	System.out.println("\n\n by ID : 21CE026");
    
    }
    }
    


