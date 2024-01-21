package oop.abstraction.newlabclass;

public abstract class ClassA {

	ClassA(){
		System.out.println("Constructor kam korche");
	}
	
	void A() {
		System.out.println("Non abstract method deuwa jay"); //je method er body nai shetai non-abstract
		
	}
	
	abstract void show();
	abstract void display();
	
	public static void func() {
		System.out.println("static function independently print holo");
	}
}
