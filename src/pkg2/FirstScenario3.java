package pkg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario3 
{

	@Test(groups="Sanity")
	public void eight_testcase()
	{
		System.out.println("this is eight testcase");
		
		Assert.assertEquals("Hello", "Hello");
	}
	
}
