public class Employee
{
	{
         System.out.println("Annonymous blobk");		
	}
	
	Employee(){}
	Employee(String str){}
	
	public static void main(String args[])	
	{
		Employee e1=new Employee();
		Employee e2=new Employee("hello");
	}
}