class Person
{
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		Person person1=new Person(2,"Maank");
		Person person2=new Person(3,"Makj");
		System.out.println(person1==person2);
		Person person3=new Person(2,"Maank");
		System.out.println(person1==person3);
		//better way
		System.out.println(person1.equals(person3));
		
		//non primitive types
		Double a=2.2;
		Double b=2.2;
		System.out.println(a==b);
		//better way
		System.out.println(a.equals(b));
		//String types
		
		String a1="hello";
		String b2="hello";
		String c3="helloxxd".substring(0, 5);
		System.out.println(c3);
		
		System.out.println(a1==b2);
		System.out.println(a1==c3);
       //better way
		System.out.println(a1.equals(c3));

	}

}
