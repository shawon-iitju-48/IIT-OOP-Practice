package oop.constructor;

public class CopyConstructorDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PractiseCopyConstructor constructor=new PractiseCopyConstructor();
		constructor.setA("Shawon");
		
		PractiseCopyConstructor cons2=new PractiseCopyConstructor(constructor);
		System.out.println(cons2.getA());
		//cons2.toString();

	}

}
