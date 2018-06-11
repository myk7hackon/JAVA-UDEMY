import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException
	{
		String filename="C:\\Users\\lenovo\\eclipse-workspace\\FileReading\\bin\\hello.txt";
		File file=new File(filename);
		Scanner in =new Scanner(file);
		while(in.hasNextLine())
		{
			String line=in.nextLine();
			System.out.println(line);
		}
	}
}
