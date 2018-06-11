import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo1 {

	public static void main(String[] args) throws FileNotFoundException {
	
		//WIthout try and catch block
		File file= new File("text.txt");
		FileReader fr = new FileReader(file);

	}

}
