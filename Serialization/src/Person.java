import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 7209486673655458835L;
	String name;
	int id;
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
}
