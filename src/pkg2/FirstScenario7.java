package pkg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario7 
{

	@Test(groups={"Sanity","Regression"})
	public void first_testcase()
	{
		System.out.println("this is first testcase");
		
		Assert.assertEquals("Hello", "Hello");
	}
	
}
