package world2;

public class Test1 {
//Same package;
	plant Plant= new plant();
	public Test1()
	{
		//public can be accessed anywhere
		Plant.name="Test1";
		//protected can be accessed in same package
		Plant.size=1;
		//Default can be accessed in same package
		Plant.cry="go!";
		//Private cant be accessed here
		//Plant.cost=0; wont work
	}
}
