package firstPkg;

public class QA4 extends QA2 implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
	
		QA4 q4 = new QA4();
		q4.sub(20, 30);
		q4.div(20, 30);
		
		q4.sum(20, 30);
				
		
	}


	
	public void QA3IM() {
		System.out.println("this is interface method");
		
	}
	
}
