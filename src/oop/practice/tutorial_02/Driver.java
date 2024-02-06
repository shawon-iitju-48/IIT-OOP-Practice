package oop.practice.tutorial_02;

public class Driver {

	public static void main(String[] args) {
		
		CircleClass circle = new CircleClass();
		circle.setRadius(10);
		System.out.println(circle.getArea());
		
		DerivedClass2 obj1= new DerivedClass2();
		obj1.print2();
		
		ChildClassforInterface obj2= new ChildClassforInterface();
		obj2.printPI1();
		obj2.printPI2();
		obj2.fprintPI1();
		obj2.fprintPI2();
		obj2.childprint();
	}

}
