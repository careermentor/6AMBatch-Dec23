package pkg2;

import org.testng.annotations.Test;

public class FirstScenario10 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first testcase");
	}
	
	
	
	@Test(enabled=false)
	public void second_testcase()
	{
		System.out.println("this is second testcase");
	}
}
