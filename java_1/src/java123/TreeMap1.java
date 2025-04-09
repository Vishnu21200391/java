package java123;

import java.util.Map;
	
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		Map<String, Integer> Employee = new TreeMap<>();
		
		System.out.println("My Empty Map: " + Employee);
		
		Employee.put("Vishnu",1);
		Employee.put("Sai",2);
		Employee.put("Krishna",3);
		Employee.put("Balu",4);
		Employee.put("Satish",5);
		Employee.put("Saif",6);
		
		System.out.println("My after put Map: " + Employee);

		Employee.remove("Satish");
		System.out.println("My after remove Map: " + Employee);

		for (Map.Entry<String, Integer> entry : Employee.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
