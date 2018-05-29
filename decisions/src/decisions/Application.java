package decisions;

import java.util.Scanner;

public class Application {
	public static void main(String[] args)
	{
		int value=10;
		if(value!=10)
		{
			System.out.println("Its not 10\n");
		}
		else
		{
			System.out.println("Its 10\n");
		}
		//elseif ladder
		if(value<=5)
		{
			System.out.print("Its smaller tha 6");
		}
		else if(value<=10)
		{
			System.out.println("Its smaller than 11 and greater than 5");
		}
		else
		{
			System.out.println("Its greater than 10");
		}
		//Switch statement
		
		String c;
		Scanner Input=new Scanner(System.in);
		c=Input.nextLine();
		switch(c)
		{
		case "Y":{System.out.println("Yes");}
		break;
		case "N":{System.out.println("No");}
		break;
		default: {System.out.println("Not known");}
		}
	}
}
