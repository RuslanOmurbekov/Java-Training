package inheritanceDemo;

public class ChildClass extends BaseClass {
	
	public static void main(String[] args) {
	//If you create object of Child class by extending parent class you can have access to all methods of Parent class and Child class
		ChildClass obj1=new ChildClass();
		  obj1.addition();
		  obj1.substraction();
		  obj1.multiplication();
		  obj1.division();
		
	// If you create object of Parent class you can't have access to methods of Child class
		 BaseClass obj2= new BaseClass();
		    obj2.addition();
			obj2.substraction();
			//obj2.multiplication();
			//obj2.division();
	 //If you create Object of Child class and reference of Parent Class you cann't have access to methods of Parent class
		 BaseClass obj3= new ChildClass();
		    obj3.addition();
		    obj3.substraction();
		  //  obj3.multiplication();
		  //  obj3.division();
		    
		    
		 
		
		
		
		
		
		
	}
	public void multiplication() {
		System.out.println("I am in Child class and multiplication is 300");
	}
	public void division() {
		System.out.println("I am in Child class and division is 300");
	
	}
}
