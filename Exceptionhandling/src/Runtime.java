
public class Runtime {

	public static void main(String[] args) {
    
		int[] ar= {1,2,3,4,5,6};
		try
		{
			System.out.println(ar[11]);
		}catch(RuntimeException e)
		{
			System.out.println(e.toString());
		}
	}

}
