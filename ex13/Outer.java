public class Outer{///Outer.class

	class Inner{// Outer$Inner.class
		void display(){
		  System.out.println("display..");
		}
	}
   public static void main(String args[]){
		
	Outer out=new Outer();
	Outer.Inner innerObj = out. new Inner();
	  innerObj.display();
	}

}