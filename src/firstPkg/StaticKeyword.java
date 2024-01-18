package firstPkg;

public class StaticKeyword 
{

	public static void meth1()
	{
		System.out.println("this is statuc method");
	}
	
	public void meth2()
	{
		System.out.println("this is not static method");
	}
	
	public static void main(String[] args) {
		StaticKeyword.meth1();
		
		StaticKeyword abc = new StaticKeyword();
		abc.meth2();
	}
	
}
