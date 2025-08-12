// Student Details

public class Student 
{
	// Class attributes
	
	String Name = "Deepika";
	int Age = 18 ;
	String gender = "F" ;
	int RollNO = 63;
	
   public void Student()  // method to display Student Details
   {
	   System.out.println("Name of the Student : "+Name);
	   System.out.println("Age : "+Age);
	   System.out.println("Gender : "+gender);
	   System.out.println("Roll No : " +RollNO);
   }
   public static void main(String arg[])
   {
	   // Creating a object 
	   
	   Student o = new Student();
	   o.Student();        // Calling the method
   }
}
