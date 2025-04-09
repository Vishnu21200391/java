package java123;
import java.util.Map;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> colors = new HashMap<>();
		System.out.println("My Empty Map:"+colors);
		colors.put("RED", 1);
		colors.put("Yellow", 2);
		colors.put("Blue", 3);
		colors.put("Green", 4);
		colors.put("White", 5);
		
		System.out.println("My after put Map:"+colors);
		colors.remove("RED");
		System.out.println("My after remove Map:"+colors);
		for (Map.Entry<String, Integer> entry : colors.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
