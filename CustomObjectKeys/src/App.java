import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
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
public class App {

	public static void main(String[] args) {
	   Person p1=new Person(1,"Sue");
	   Person p2=new Person(2,"Mike");
	   Person p3=new Person(3,"Bob");
	   Person p4=new Person(1,"Sue");
	   
	   Map<Person,String> record=new LinkedHashMap<Person,String>();
	   record.put(p1,"hello");
	   record.put(p2,"ramesh");
	   record.put(p3,"how");
	   record.put(p4,"u doin");
	   
	   for(Person p:record.keySet())
	   {
		   String value=record.get(p);
		   System.out.println(p+"  -->  "+value);
	   }
	   System.out.println("p1 and p4 are same so we dont have multiple keys to them and only 3 additions are made to the map\n ");
	   Set<Person> records=new LinkedHashSet<Person>();
	   
	   records.add(p1);
	   records.add(p2);
	   records.add(p3);
	   records.add(p4);
 
	   for(Person p:records)
	   {
		   System.out.println(p);
	   }
	   System.out.println("p1 and p4 are same so we dont have multiple keys to them and only 3 additions are made to the set\n ");
	}

}
