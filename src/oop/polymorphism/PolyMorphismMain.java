package oop.polymorphism;

public class PolyMorphismMain {

	public static void main(String[] args) {
		
		System.out.println(PolyMorphismHelper.Multiply(12.7, 86.6));
		System.out.println(PolyMorphismHelper.Multiply(5, 6,56));
		
		PolyMorphismHelper helper= new PolyMorphismHelper();
		System.out.println(helper.Concate("Md. Bokhtiar Nadeem ", "Shawon"));
		
		
		RuntimePolyParent parent=new RuntimePolyParent();
		parent.print();
		
		parent=new RuntimePolyChildOne();
		parent.print();
		
		parent= new RuntimePolyChildTwo();
		parent.print();
	}

}
