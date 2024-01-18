package firstPkg;

public class Additions 
{
	
	public Additions(int a, int b)
	{
		
		int c = a*b;
		System.out.println("mul of a&b: " + c);
		System.out.println("this is a constructor");
		
		
	}
	
	
	public float sum1()
	{
		int a = 20;
		float b = 30.5f;
		float c = a+b;
		System.out.println("sum1 of a&b: " + c);
		return c;
	}
	
	public int sum2(int a, int b)
	{
		int c = a+b;
		System.out.println("sum2 of a&b: " + c);
		return c;
	}
	
	
	//10+20+30
	//int x = 10+20
	//x+30
	
	
	public static void main(String[] args) {
		
		Additions add = new Additions(20, 30);  //constructor will be automatically when we create object of the class
		
		add.sum1();
		add.sum2(30, 40);
		add.sum2(40, 50);
		
		int x = add.sum2(10, 20);
		add.sum2(x, 30);
		
				
		
	}
}
