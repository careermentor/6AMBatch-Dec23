package firstPkg;


public class FirstClass 
{

	int a = 10;
	
	
	public void firstMethod()
	{
		//int a = 100;
		
		System.out.println(a);
		
		
	}
	
	public void printLine()
	{
		System.out.println("this is a test statement");
		
	}
	
	
	public static void main(String[] args) 
	{
	
		FirstClass abc = new FirstClass();  //create object of the class (object is abc)
		abc.firstMethod();
		abc.printLine();
		
		System.out.println(abc.a);
	}
	
	
	
	
	
	

}