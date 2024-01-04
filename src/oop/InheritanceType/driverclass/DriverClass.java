package oop.InheritanceType.driverclass;

import oop.InheritanceType.hierarchy.ChildCase2;
import oop.InheritanceType.hierarchy.ChildClass1;
import oop.InheritanceType.multiple.ChildClassSecond;



public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  ChildClass1 o= new ChildClass1();
	  o.baseClassPrint();
	  o.childClass1Print();
	  
	  ChildCase2 t=new ChildCase2();
	  t.baseClassPrint();
	  t.childClass2Print();
	  
	  //multiple inheritance
	  ChildClassSecond cs=new ChildClassSecond();
	  cs.getT();
	  cs.getParentClassOne();

	}

}
