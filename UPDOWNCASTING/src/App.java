class Machine
{
	void run()
	{
		System.out.println("MAchine starts");
	}
}
class Camera extends Machine
{

	@Override
	void run() {
		System.out.println("Camera starts");
	}
	
	void snap()
	{
		System.out.println("Snap taken");
	}
	
}
public class App {
public static void main(String[] args)
{
	Machine m1=new Machine();
	Camera c1=new Camera();
	//Upcasting
	Machine m2=c1;
	m2.run();
	//Error:m2.snap();
	
	//Downcasting;
	Machine m3=new Camera();
	Camera c2=(Camera)m3;
	c2.run();
	c2.snap();
	
	//Incorrect downcasting
	/*
	 Machine m4=new Machine();
	 Camera c3=(Camera) m4;
	 c3.run();
	 c3.snap();*/
	
}
}