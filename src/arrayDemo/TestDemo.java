package arrayDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(3);
		System.out.println(TestDemo.findUniqueNumbers(ls));
		
	}
	
	public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
		List<Integer> ls = (List<Integer>) numbers;
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < ls.size(); i++) {
			int count = 0;
			for (int j = 0; j < ls.size(); j++) {
				
				if(ls.get(i) == ls.get(j)) {
					count++;
				}
			}
			if(count == 1) {
				myList.add(ls.get(i));
			}
		}
       return myList;
    }

}
