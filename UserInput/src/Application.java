import java.util.Scanner;

public class Application {

	public static void main(String[] args)
	{
		Scanner Input=new Scanner(System.in);//Pressed Ctrl+SHift+o
	//Waitfor the user to write something
		String line=Input.nextLine();
	//Output to console
		System.out.println(line);
	  int InputInt =Input.nextInt();
	  System.out.println(InputInt);
	  
	  double value=Input.nextDouble();
	  System.out.println(value);
	}
}
