package setExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> obj1= new LinkedHashSet();
		obj1.add("Postman");
		obj1.add("Maven");
		obj1.add("Java");
		obj1.add("Selenium");
		obj1.add("Cucumber");
		obj1.add("Java");
		
		ArrayList<String> obj2= new ArrayList<>(obj1);
		//String st=obj2;
		System.out.println(obj2);

	}

}
