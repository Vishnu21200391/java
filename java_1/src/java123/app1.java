package java123;

import java.util.Set;
import java.util.HashSet;

public class app1 {
	
	public static void main(String[] args) {
		Set<String> gods = new HashSet<>();
		System.out.println("MY EMPTY SET: " + gods);
		
		// Adding elements
		gods.add("Ram");
		gods.add("Krishna");
		gods.add("Baba");
		gods.add("Balu");
		gods.add("Vishnu");
		gods.add("Sai");
     	gods.remove("Sai");
		gods.add(null);
		
		System.out.println("MY SET AFTER ADDING ELEMENTS: " + gods);
		
		System.out.println("PRINTING ELEMENTS USING FOR LOOP:");
		for (String god : gods) {
			System.out.println("PRINTING ELEMENTS USING FOR LOOP:"+god);
		}
	}
}

