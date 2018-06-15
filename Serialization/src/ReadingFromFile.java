import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingFromFile {

	public static void main(String[] args) {
		try(FileInputStream fi=new FileInputStream("people.bin"))
		{
			ObjectInputStream obj =new ObjectInputStream(fi);
			Person person2=(Person)obj.readObject();
			System.out.println(person2);
			Person person1=(Person)obj.readObject();
			System.out.println(person1);
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
