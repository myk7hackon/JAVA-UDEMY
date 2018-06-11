import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo3 {

	public static void main(String[] args) throws FileNotFoundException {
openFile();
	}
	public static void openFile() throws FileNotFoundException
	{
		File file= new File("text.txt");
		FileReader fr = new FileReader(file);
	}

}
