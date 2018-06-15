
public enum Animal {
	CAT("Dulaari"),DOG("Kaalu"),MOUSE("Balua");
	private String name;
	Animal(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public String toString()
	{
		return "This animal is called "+this.name;
	}
}
