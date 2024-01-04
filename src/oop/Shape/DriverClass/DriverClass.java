package oop.Shape.DriverClass;

import oop.Shape.Class.Circle;
import oop.Shape.Class.Tri;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle=new Circle();
		System.out.println(circle.area(6));
		
		Tri tri=new Tri();
		System.out.println(tri.area(8, 2));
		

	}

}
