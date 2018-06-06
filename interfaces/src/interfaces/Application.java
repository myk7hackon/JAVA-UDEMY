package interfaces;

public class Application {

	public static void main(String[] args)
	{
	machine m=new machine();
	person p=new person();
	Info i;
	p.showInfo();
	m.showInfo();
	i=p;
	i.showInfo();
	i=m;
	i.showInfo();
}
}