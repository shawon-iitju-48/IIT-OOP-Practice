package oop.Shape.Class;

public class Circle extends Shape{
	
	
	
	
	public double radian=3.1416;
	@Override
	public double area(int r) {
		// TODO Auto-generated method stub
		return radian* super.area(r) * super.area(r);
		
		
	}
	
	
}
