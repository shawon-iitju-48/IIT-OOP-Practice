package oop.InheritanceType.SingleandMultilevel;

public class DerivedBike extends mountainBike {
	
	public DerivedBike()
	{
		
	}
	
	public DerivedBike(int gear, int speed, int startheight) {
		super(gear, speed, startheight);
		// TODO Auto-generated constructor stub
	}

	public void childBike()
	{
		System.out.println("this is derived class");
	}

}
