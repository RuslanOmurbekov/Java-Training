package ListDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList obj1= new ArrayList();
		obj1.add(123);
		obj1.add('c');
		obj1.add("String");
		obj1.add(2.2);
		obj1.add("String");
		
		
		Iterator itr=obj1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	

}
