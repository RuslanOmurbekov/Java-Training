package interfaceDemo;

public class AdvancedCalculator implements Calculator {

	public static void main(String[] args) {

		// If you create object of Child class by extending Interfaces you can have
		// access to all methods of Interface class and Child class
		AdvancedCalculator obj1 = new AdvancedCalculator();
		obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();

		// If you create object of class and reference of Interface you can'thave access
		// to methods of Child class
		// You cannot create object of Interface
		Calculator obj2 = new AdvancedCalculator();
		obj2.add();
		obj2.sub();
		// obj2.calculateSin();
		// obj2.calculateCos();

		// AdvancedCalculator obj3= new Calculator();
		// You cannot create object of Interface because it has abstract method

	}

	public void calculateCos() {
		System.out.println("I am in advanced Cal-Cos method");
	}

	public void calculateSin() {
		System.out.println("I am in advanced Cal-Sin method");
	}

	public void add() {
		System.out.println("I am in add method");

	}

	public void sub() {
		System.out.println("I am in sub method");

	}

}
