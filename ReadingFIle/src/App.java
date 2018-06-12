import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file=new File("test.txt");
		FileReader fr=null;
		try {
			 fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found:"+file.toString());
		}
		BufferedReader br=null;
		try{
		 br= new BufferedReader(fr);
		} catch(NullPointerException e)
		{
		System.out.println("Null pointer Exception");
		}
		String line;
		try {
			while((line=br.readLine())!=null)
				System.out.println(line);
		} catch (IOException e) {
			System.out.println("File not found");
		}catch(NullPointerException e)
		{
			System.out.println("Come to line 32");
		}
		finally
		{
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("File cant be closed");
		} catch(NullPointerException e)
		{
			System.out.println("Come to line 42");
		}
	}
	}

}
