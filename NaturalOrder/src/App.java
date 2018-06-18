import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>
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
		return name;
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
	@Override
	public int compareTo(Person o) {
		if(name.length()>(o.getName()).length())
			return 1;
		if(name.length()<(o.getName()).length())
			return -1;
		
		else 
			return name.compareTo(o.getName());
	}
}
public class App {

	public static void main(String[] args)
	{
		List<Person> list = new LinkedList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();
		
		list.add(new Person(1254,"Hello"));
		list.add(new Person(12,"Ravi"));
		list.add(new Person(154,"Babh"));
		list.add(new Person(125,"hah"));
		list.add(new Person(1,"Hoya"));
		
		set.add(new Person(1254,"Hello"));
		set.add(new Person(12,"Ravi"));
		set.add(new Person(154,"Babhii"));
		set.add(new Person(125,"hah"));
		set.add(new Person(1,"Hoya"));
		
		Collections.sort(list);
		
		System.out.println("Sorted List");
		
		System.out.println("\n");
		
		show(list);
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		  
		System.out.println("Sorted Set");
		show(set);
		
		
	}
	private static void show( Collection<Person> col)
	{
		for(Person val:col)
			System.out.println(val);
	}
}
