package ListDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListGenericsDemo {

	public static void main(String[] args) {
		ArrayList<String> obj1= new ArrayList<>();
		obj1.add("Java");
		obj1.add("Selenium");
		obj1.add("Cucumber");
		
		for(String str:obj1) {
			System.out.println(str);
		}
		
	}
	
	

}
