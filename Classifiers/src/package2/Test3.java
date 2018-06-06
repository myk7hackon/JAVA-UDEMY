package package2;

import world2.plant;

//separate package 
public class Test3 {
	plant Plant= new plant();
	public Test3()
	{
		//public can be accessed anywhere
		Plant.name="Test1";
		//protected cant be accessed 
		//Plant.size=1; wont work
		//Default can be accessed in same package
		//Plant.cry="go!"; wont work
		//Private cant be accessed here
		//Plant.cost=0; wont work
	}

}
