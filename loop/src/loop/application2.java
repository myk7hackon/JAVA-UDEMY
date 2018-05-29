package loop;

import java.util.Scanner;

public class application2 {
public static void main(String[] args)
{
int value=10;
//while loop
while(value>0)
	{
		System.out.println("Hello"+value);
		value--;
	}
value=10;
//for loop
for(value=0;value<=10;value++)
		{
			//System.out.println(value + "Hello");
			System.out.printf("Value is %d\n",value);
		}
//do while
Scanner input=new Scanner(System.in);
int valueIn=0;
do{
	 valueIn=input.nextInt();
	System.out.println("Value is    "+valueIn);
}while(valueIn!=5);
}
}