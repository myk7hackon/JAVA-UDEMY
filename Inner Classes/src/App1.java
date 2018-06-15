
public class App1 {
	public int id;
	
public App1(int id) {		
	this.id = id;
	}
//private inner class
private class Number1
{
	public void warning()
	{
		System.out.println("In Private class method "+id);
	}
}
//using methods
public void use()
{
	Number1 a= new Number1();
	a.warning();
}
 //Public inner class
public class Number2
{
	public void warning()
	{
		System.out.println("In Public class method "+id);
	}
}

//static inner class
public static class Number3
{
	public void warning()
	{
		System.out.println("In static class method cant use non static member id");
	}

}
//inner class in a method
public void use2()
{
	int value=1;
	final String name="Hello";
	class Number4{
		public void warning()
		{
			System.out.println(name+" is In inner class in a  method ");
			System.out.println(value+" is In inner class in a  method ");
		}
	}
	Number4 n=new Number4();
	n.warning();
}
}
