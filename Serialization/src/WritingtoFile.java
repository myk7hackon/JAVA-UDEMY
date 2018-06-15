import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingtoFile {

	public static void main(String[] args) {

		Person person1= new Person("Mike",12);
		Person person2=new Person("Sue",13);
		try(FileOutputStream fo= new FileOutputStream("people.bin"))
		{
			ObjectOutputStream obj=new ObjectOutputStream(fo);
			obj.writeObject(person1);
			obj.writeObject(person2);
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
