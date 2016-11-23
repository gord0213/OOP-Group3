package Symponey.Domain;

public class Test {

	
	public static void main(String[] args)
	{
		
		GetID temp = new GetID();
		temp.getIDString();
		System.out.println(temp.getIDString());
		
		Movement mov = new Movement("Test");
		System.out.println(mov.toString());
		System.out.println(mov);
		
		
	}
}
