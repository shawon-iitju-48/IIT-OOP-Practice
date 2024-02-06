package oop.practice.tutorial_02;

public class ChildClassforInterface implements ChildInterface{

	@Override
	public void printPI1() {
		// TODO Auto-generated method stub
		System.out.println("Parent class 1 print...");
	}

	@Override
	public void fprintPI1() {
		// TODO Auto-generated method stub
		System.out.println("Parent class 1 fprint...");
		
	}

	@Override
	public void printPI2() {
		// TODO Auto-generated method stub
		System.out.println("Parent class 2 print...");
	}

	@Override
	public void fprintPI2() {
		// TODO Auto-generated method stub
		System.out.println("Parent class 2 fprint...");
	}

	@Override
	public void childprint() {
		// TODO Auto-generated method stub
		System.out.println("I am child print me...");
	}

}
