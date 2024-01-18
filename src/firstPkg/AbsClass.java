package firstPkg;

public abstract class AbsClass   //concrete class
{

	
	public void meth3()
	{
		System.out.println("this is own class method");
		

		 int i = 30;
		//i=40;
		
	}
	
	public void meth1()    //concrete method
	{
		System.out.println("this is also called concrete method");
	}
	
	
	public abstract void meth2();
	public abstract void meth4();
	
}
