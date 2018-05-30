package multidimensional_arrays;

public class Application {
public static void main(String[] args)
{
	//Multidimensional arrays
	int[][] grid= {
			{1,2,3,4},
			{3,4,5},
			{7,8,9,11}
	};
	System.out.println(grid[1][2]);
	//only definition
	
	String[][] grid2=new String[2][3];
	grid2[0][1]="Hello there\n";
	System.out.println(grid2[0][1]);
	//now doing all the initialisations
	for(int i=0;i<grid2.length;i++)
	{
		for(int j=0;j<grid2[i].length;j++)
			grid2[i][j]="hellooooo\n";
	}
	
}
}
