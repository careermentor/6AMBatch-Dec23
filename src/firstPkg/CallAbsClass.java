package firstPkg;

public class CallAbsClass extends AbsClass
{

	

	
	public void meth2() 
	{
	
		System.out.println("my credential");
		
	}
	
	public static void main(String[] args) {
		
		CallAbsClass abc= new CallAbsClass();
		abc.meth1();
		abc.meth2();
		abc.meth3();
	}

		public void meth4() {
			System.out.println("my method 4");
		
	}
	
}
