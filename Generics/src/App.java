import java.util.ArrayList;
import java.util.HashMap;

public class App {
///before java 5
	public static void main(String[] args)
	{
	ArrayList list = new ArrayList();
	list.add("Hello");
	list.add("Mail");
	String ans=(String)list.get(1);
	System.out.println(ans);
//after
	ArrayList<String> list2= new ArrayList<String>();
	list2.add("Hello");
	list2.add("Mail");
	 ans=(String)list2.get(0);
	System.out.println(ans);
//Hashmap
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	//map[2]="Hello";
	
	
	
}
}
