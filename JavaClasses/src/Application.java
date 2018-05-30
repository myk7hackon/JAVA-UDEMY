
class Person
{
	/*classes can contain
	 * 1.data
	 * 2.subroutines
	 */
	//data
	String name;
	int age;
	//subroutines
	void speak()
	{
		System.out.printf("Hello %s\n",this.name);
		//or
		System.out.println("Hello "+this.name+" your age is "+this.age);
	}
	//setters
	public void setName(String newname)
	{
		name=newname;
	}
	public void setAge(int newage)
	{
		age=newage;
	}
	//constructor
	public Person()
	{
		System.out.printf("Constructor on work\n");
	}
	//2nd constructor
	public Person(String s)
	{
		this();//calling 1st constructor
		name=s;
	}
}
public class Application {
	public static void main(String[] args)
	{
Person one= new Person();
one.name="jack";
one.age=19;
System.out.println(one.name);
one.speak();
Person two=new Person();
two.setAge(12);
two.setName("hola");
two.speak();
}
}