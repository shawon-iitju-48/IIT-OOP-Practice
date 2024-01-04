package oop.Shape.Class;

public class Tri extends Shape{


		public double base;
		public double height;
		
		public void base(int b)
		{
			base=b;
		}
		
		public void height(int h)
		{
		   height=h;
		}
		
		public double area(double base,double height) {
			// TODO Auto-generated method stub
			return .5*base*height;
			
			
		}
	}


