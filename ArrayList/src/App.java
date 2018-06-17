import java.util.ArrayList;

public class App {

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//adding data
		numbers.add(10);
		numbers.add(110);
		numbers.add(101);
		numbers.add(100);
		numbers.add(18);
		
		//retrieving data
		System.out.println(numbers.get(4));
		
		//iterating using size() method
		for(int i=0;i<numbers.size();i++)
			System.out.println(numbers.get(i));
		
		//using other approach
		for(Integer i:numbers)
			System.out.println(i);
	}
}
