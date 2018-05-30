
class Thing
{
	public String name;
	public static String description; //only one copy for the whole class
	//static methods only access static members
	public static void info()
	{
		System.out.println(description);
		//error
		//System.out.println(name);
		}
	//final is used for constant
	public final int p=8;
}
public class Application {
public static void main(String[] args)
{
	Thing.description="I Am Groot";//accessed by class name
	System.out.println(Thing.description);
	Thing.info();
	//another static
	System.out.println(Math.PI);
	Thing thing1=new Thing();
	//thing1.p=8; error
}
}
