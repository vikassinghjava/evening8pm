class Parent
{  	public void show()
	{
	   System.out.println("show");
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