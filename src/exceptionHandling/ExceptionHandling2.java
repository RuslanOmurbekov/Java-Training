package exceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		
		try {
			int c=10/0;

			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Check the exception "+ e.getMessage());
			System.out.println("Seems you provide zero please provide value>0");
		}
		catch(InputMismatchException e) {
			System.out.println("Oops something went wrong");
		}
        catch(Exception e) {
			System.out.println("Handle everything");
		}
		finally {
			System.out.println("Finally block");
			System.out.println("End");
		}
		

	}

}
