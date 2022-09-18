class Parent
{  	public void show()
	{
	   System.out.println("show");
	}
	
		public void display()
	{
	   System.out.println("display");
	}

}
public class Child extends Parent
{
  public static void main(String args[])
	{
	   Child ch=new Child();
		ch.show();
	}

}