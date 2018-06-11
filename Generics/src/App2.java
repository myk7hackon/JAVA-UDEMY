import java.util.ArrayList;

class Machine
{

	@Override
	public String toString() {
		return "I am a Machine";
	}
	public void start()
	{
	  System.out.println("Mac is running");
	}
	
}
class Camera extends Machine
{
	@Override
	public String toString() {
		return "I am a Camera";
	}
	public void start()
	{
	  System.out.println("Cam is running");
	}
}
public class App2 {
public static void main(String args[])
{
	ArrayList<Machine> strings= new ArrayList<Machine>();
	strings.add(new Machine());
	strings.add(new Machine());
	show(strings);
	ArrayList<Camera> strings2= new ArrayList<Camera>();
	strings2.add(new Camera());
	strings2.add(new Camera());
	//show(strings2);
	
}
public static void show(ArrayList<? super Camera> ar)//Wildcard
{
	for(Object value:ar)
	{
		System.out.println(value);
		((Machine) value).start();
	}
}
}
