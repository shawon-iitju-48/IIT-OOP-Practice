package oop.constructor;

public class PractiseCopyConstructor {
	
	private String a;
	//default constructor
	
	PractiseCopyConstructor()
	{
		
	}

	//copy constructor

	
	PractiseCopyConstructor(PractiseCopyConstructor b)
	{
		this.a=b.a;
	}
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	public String toString()
	{
		return "PractiseCopyConstructor [a=" +a+ "}";
	}
	

}
