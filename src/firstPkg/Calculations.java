package firstPkg;

public class Calculations 
{
	int a = 20;
	
	int b = 30;
	int c = a+b;

	public void printVal()
	{
		System.out.println(a);  //20
	}
	
	
	public void add()
	{
		final int a = 100;
		//a=200;
		System.out.println(a);  //100
		
		System.out.println("sum of a&b: " + c);
		
		System.out.println("c");
		
		System.out.println(10+15);
		
		System.out.println("a" + "b");
		
		System.out.println("a" + 5);
		
	}
	
	public static void main(String[] args)
	{
		Calculations cal = new Calculations();
		
		cal.add();
		cal.printVal();
		
		
	}
	
	
}
