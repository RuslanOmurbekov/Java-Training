package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> obj1= new LinkedHashMap<String, String>();
		obj1.put("100", "JAVA");
		obj1.put("400", "Selenium");
		obj1.put("200", "Cucumber");
		obj1.put("300", "MAVEN");
		
		for(Map.Entry<String, String> data:obj1.entrySet()) {
		System.out.println(data.getKey()+data.getValue());

	}

}
}
