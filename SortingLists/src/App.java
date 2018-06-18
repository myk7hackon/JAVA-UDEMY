import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Person
{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
class LengthComparator implements Comparator<String>
{

	@Override
	public int compare(String arg0, String arg1) {
		if(arg0.length()<arg1.length())
			return -1;
		else if(arg0.length()>arg1.length())
		return 1;
		else
			return 0;
			
	}
	
}

class ReverseComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -1*o1.compareTo(o2);
	}
	
}
public class App {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Akash");
		list.add("ShyameshwaramIyer");
		list.add("Hablushi");
		list.add("Babluagha");
		
		Collections.sort(list);
		
		//An alphabetical sort
		for(String p:list)
			System.out.println(p);

	
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
	//Sorting based on reverse alphabetically
	Collections.sort(list,new ReverseComparator());
	
	for(String p:list)
		System.out.println(p);
	
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	//Sort based on string length
	
	Collections.sort(list,new LengthComparator());
	
	for(String p:list)
		System.out.println(p);
	
	
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");

	//Using Anonymous CLass
	
	List<Integer> numbers=new LinkedList<Integer>();
	
	numbers.add(90);
	numbers.add(0);
	numbers.add(-10);
	numbers.add(304);
	numbers.add(-191);
	
	//reverse order
	Collections.sort(numbers, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return -1*o1.compareTo(o2);
		}
		
	});
	
	for(Integer value:numbers)
		System.out.println(value);
	
	
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	
	
	//On our own class objects
	
	List<Person> people = new LinkedList<Person>();
	
	people.add(new Person(229,"Mike"));
	people.add(new Person(29,"Rue"));
	people.add(new Person(9,"Sue"));
	people.add(new Person(49,"Ross"));
	people.add(new Person(22,"Oprah"));
	
	
	Collections.sort(people, new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getId()<o2.getId())
				return -1;
			else if(o1.getId()>o2.getId())
				return 1;
			else
				return 0;
		}
		
	});
	
	for(Person value:people)
		System.out.println(value);
	
	}
}