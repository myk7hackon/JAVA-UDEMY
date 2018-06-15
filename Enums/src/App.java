
public class App {
	public static void main(String[] args) {
		
		Animal number1=Animal.valueOf("CAT");
		System.out.println(number1);
		Animal number2=Animal.CAT;
		System.out.println(number2);
		System.out.println("this animal is called "+Animal.DOG.name());
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
	}

	
}
