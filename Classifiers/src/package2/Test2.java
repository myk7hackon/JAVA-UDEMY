package package2;
import world2.plant;
// child class
public class Test2 extends plant{
	public Test2()
	{
		//public can be accessed anywhere
	name="Test1";
		//protected can be accessed in child class
	   size=1;
		//Default can be accessed in same package
		// Plant.cry="go!"; wont work
		//Private cant be accessed here
		//Plant.cost=0; wont work
	}

}
