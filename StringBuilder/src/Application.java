class Frog
{
	public String toString() {
		return "Froggy";
	}
}
public class Application {
public static void main(String[] args)
{
	//string builder class
	StringBuilder sb= new StringBuilder();
	sb.append("Hello").append(" ").append("Jack").append(" ").append("Ma");
	System.out.println(sb);
	
	//toString method
	Frog frog= new Frog();
	System.out.println(frog);
	
	
}
}
