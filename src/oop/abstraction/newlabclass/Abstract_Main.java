package oop.abstraction.newlabclass;

public class Abstract_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ClassA a = new ClassA(); An instance of an abstract class can not be created.

		ClassA x = new ClassB(); // Constructor kam korlo, kintu abstract class ke direct call korte parlam na
		x.A();
		x.show();
		x.display();
		
		ClassA.func(); //static method call korte kno object create korte holona
		
		
	}
}
