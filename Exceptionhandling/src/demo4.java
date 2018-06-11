import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo4 {

	public static void main(String[] args) {
		openFile();
	}
	public static void openFile()
	{
		File file= new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
