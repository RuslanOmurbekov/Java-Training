package ListDemo;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1= new ArrayList();
		obj1.add(123);
		obj1.add('c');
		obj1.add("String");
		obj1.add(2.2);
		System.out.println(obj1);
		System.out.println(obj1.get(3));
	}
	
	

}
