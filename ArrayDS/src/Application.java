
public class Application {

	public static void main(String[] args)
	{
		//array of integers
		int[] Values;
		Values = new int[10];
		//default values
		System.out.println(Values[0]);
		//Initialising the array
		for(int i=0;i<10;i++)
			Values[i]=i+9;
		//or
		for(int i=0;i<Values.length;i++)
			Values[i]=i+9;
		//Now Value
		System.out.println(Values[0]);
		//anotherinitialisation
		int[] numbers= {1,2,3,4,5};
		System.out.println(numbers.length);
		//array of strings
		String[] StringArray=new String[3];
		StringArray[0]="How";
	    StringArray[1]="you";
	    StringArray[2]="doin'";
	    for(String r:StringArray)
	    {
	    	System.out.println(r);
	    }
	    //or
	    for(int i=0;i<StringArray.length;i++)
	    	System.out.println(StringArray[i]);
	}
}
