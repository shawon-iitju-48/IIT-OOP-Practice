package oop.interfacee;

public class Driver_Vehicle {

	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle();
        bicycle.changeGear(20);
        bicycle.speedUp(30);
        bicycle.applyBrakes(10);
         
        System.out.print("Bicycle present state : ");
        bicycle.printStates();
         
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(10);
        bike.speedUp(40);
        bike.applyBrakes(30);
         
        System.out.print("Bike present state : ");
        bike.printStates();

	}

}
