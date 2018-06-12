import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file= new File("test.txt");
		try(BufferedWriter br=new BufferedWriter(new FileWriter(file)))
		{
			br.write("First line\n");
			br.newLine();
			br.write("Hello");br.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
