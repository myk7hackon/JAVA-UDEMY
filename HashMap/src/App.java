import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//Adding values
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(6, "six");
		map.put(5, "five");
		
		//Retrieving Values
		
		System.out.println(map.get(5));
		System.out.println(map.get(3));
		
		//Iteration
		
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			Integer i=entry.getKey();
			String value=entry.getValue();
			System.out.println(i+" --> "+value);
		}
		
	}

}
