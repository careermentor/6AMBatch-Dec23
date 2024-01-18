package firstPkg;

public class QA2 extends QA1
{
	
	int x = 30;
	
	public void printVal()
	{
		final int x = 50;
		//x = 200;
		System.out.println(x);  //50//200
		System.out.println(this.x); //30
		System.out.println(super.x);  //100
		
		super.sum(20, 30);
		
	}
	

	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sub(20, 30);
		
		
		q2.sum(20, 30);  
		q2.printVal();
		
		
				
		
	}


	
	public void QA1IM() {
		System.out.println("this is method of QA1 I interface");
		
	}
	
}
