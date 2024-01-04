package oop.InheritanceType.SingleandMultilevel;

public class bicycle {
  public int gear;
  public int speed;
  
  public bicycle()
  {
	  
  }
  
  public bicycle(int gear, int speed) {
	super();
	this.gear = gear;
	this.speed = speed;
}

  public void applyBrake(int dec)
  {
	  speed-=dec;
  }
  
  public void speedup(int inc)
  {
	  speed+=inc;
  }
  
  public void parentClass()
  {
	  System.out.println("this is a parent class");
  }

@Override
public String toString() {
	return "bicycle [gear=" + gear + ", speed=" + speed + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
  
}
