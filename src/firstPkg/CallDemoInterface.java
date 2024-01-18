package firstPkg;

public class CallDemoInterface implements DemoInterface
{

	public void cm1()
	{
		System.out.println("this is a concrete method");
	}

	
	public void mi1() {
	System.out.println("this is interface method1");
		
	}

	
	public void mi2() {
		System.out.println("this is interface method2");
		
	}
	
	public static void main(String[] args) {
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.cm1();
		cdi.mi1();
		cdi.mi2();
	}
	
}
