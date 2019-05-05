package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		try {
			int c=10/0;

			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Check the exception "+ e.getMessage());
			System.out.println("Seems you provide zero please provide value>0");
		}
		System.out.println("End");

	}

}
