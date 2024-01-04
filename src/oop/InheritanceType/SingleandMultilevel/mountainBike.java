package oop.InheritanceType.SingleandMultilevel;

public class mountainBike extends bicycle {
	public int seatheight;
	
	public mountainBike()
	{
		
	}
	
	public mountainBike(int gear,int speed,int startheight)
	{
		super(gear,speed);
		this.seatheight=startheight;
		
	}
	
	public void seatheight(int newValue)
	{
		seatheight=newValue;
	}
     
	public void mountineBikeInter()
	{
		System.out.println("this is intermediatory class");
	}
	@Override
	public String toString() {
		return "mountainBike [seatheight=" + seatheight + " and\n" 
				+super.toString();
	}
	

	
	
}
