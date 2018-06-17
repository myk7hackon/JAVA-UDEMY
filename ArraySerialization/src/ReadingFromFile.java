import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadingFromFile {

	public static void main(String[] args) {
		try(FileInputStream fi=new FileInputStream("people.bin"))
		{
			ObjectInputStream obj =new ObjectInputStream(fi);
			Person[] people=(Person[]) obj.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList =(ArrayList<Person>) obj.readObject();
			for(Person person:people)
				System.out.println(person);
			for(Person person:peopleList)
				System.out.println(person);
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
