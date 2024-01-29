package oop.polymorphism;

public class PolyMorphismHelper {
	
	static int Multiply(int a, int b,int c)
    {
        return a *b*c;
    }
	
    static double Multiply(double a, double b)
    {
        return a * b;
    }
    
    String Concate(String a, String b)
    {
    	return a+b;
    }
    String Concate(String a)
    {
    	return a;
    }
}
