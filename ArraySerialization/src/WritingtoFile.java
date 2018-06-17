import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WritingtoFile {

	public static void main(String[] args) {

		Person[] People= {new Person("Mike",1),new Person("Sue",2),new Person("Eon",30),new Person("Ram",18)};
		ArrayList<Person> peopleList=new ArrayList<Person>(Arrays.asList(People)) ;
		try(FileOutputStream fo= new FileOutputStream("people.bin"))
		{
			ObjectOutputStream obj=new ObjectOutputStream(fo);
			obj.writeObject(People);
			obj.writeObject(peopleList);
			obj.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
