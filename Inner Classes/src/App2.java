
public class App2 {

	public static void main(String[] args) {
	
		App1 app1 = new App1(2);
		app1.use();
		App1.Number2 n1=app1.new Number2();
		n1.warning();
		App1.Number3 n2=new App1.Number3();
		n2.warning();
		app1.use2();
	}

}
