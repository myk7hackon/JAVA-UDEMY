import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> set =  new HashSet<String>() ;
		//Adding animal names
		set.add("ant");
		set.add("bear");
		set.add("cat");
		set.add("deer");
		set.add("eel");
		System.out.println(set);
		
		//iterating
		int i=0;
		for(String value:set)
		{
			System.out.println(i+1 +" "+value);
			i++;
	}
		
		//checking if set contains something
		
		System.out.println("It has fish "+set.contains("fish"));
		System.out.println("It has cat "+set.contains("cat"));
		
		//New set
		Set<String> set2 =  new HashSet<String>() ;
		//Adding animal names
		set2.add("ant");
		set2.add("bear");
		set2.add("fish");
		set2.add("giraffe");
		set2.add("hen");
		System.out.println(set);
		
		//Intersection
		
		Set<String> intersection = new HashSet<String>(set2);
		intersection.retainAll(set);
		System.out.println(intersection);
		
		//difference
		Set<String> difference = new HashSet<String>(set2);
		
		difference.removeAll(set);
		System.out.println(difference);
		
}
}
