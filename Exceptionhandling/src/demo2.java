import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo2 {

	public static void main(String[] args) {

		File file= new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
			//If file doest exist then execution here jumps to catch
			System.out.println("Success......");
		} catch (FileNotFoundException e) {
			// Prints error
			e.printStackTrace();
		}
	}

}
