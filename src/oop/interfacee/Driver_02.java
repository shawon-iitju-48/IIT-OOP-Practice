package oop.interfacee;

public class Driver_02 implements InterfacePrac_02{

	public static void main(String[] args) {
		
		Driver_02 obj = new Driver_02();
		obj.summer();
		obj.printing();
		
	}
	
	int sum=0;
	@Override
	public void summer() {
		// TODO Auto-generated method stub
		sum=num1+num2;
		
	}
	@Override
	public void printing() {
		// TODO Auto-generated method stub
		System.out.println(sum);
	}
	

}
