package opp.package2;
import oop.package1.*;

public class ClassP2 {

	public static void main(String[] args) {
		
		ClassP1 ii = new ClassP1();
		
		ClassP2second p2Second = new ClassP2second();
		p2Second.setA("hello from  package2");
		System.out.println(p2Second.getA());
		
	}

}
