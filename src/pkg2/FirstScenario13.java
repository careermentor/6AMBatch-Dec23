package pkg2;


import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstScenario13 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first testcase");
		
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test(groups="Regression")
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	
	@Test(dependsOnMethods = "third_testcase")
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	@Test
	public void seventh_testcase()
	{
		System.out.println("this is seven test case");
	}
}

