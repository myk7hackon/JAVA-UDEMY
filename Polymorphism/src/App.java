
public class App {
public static void main(String[] args)
{
	Plant plant=new Plant();
	Tree tree =new Tree();
	Plant plant2=tree;
	plant.grows();
	plant2.grows();
}
}
