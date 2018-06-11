class Machine
{
public void start()
{
	System.out.println("Machine Starting");
}
}
interface Plant
{
	public void grow();
}
public class App {
public static void main(String[] args)
{
	Machine machine=new Machine(){

	@Override
	public void start() {
		System.out.println("Machine hain chalegi");
	}
	
};
machine.start();
Plant plant=new Plant(){
	public void grow()
	{
		System.out.println("Plant is growing");
	}
};
plant.grow();
}
}
