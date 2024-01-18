package org.wipro.automation.uo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.uo.pages.SignUpPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void validatesignupfunc() throws Exception
	{
		SignUpPage sign = new SignUpPage(driver);
		
		sign.click_createnewaccountlink();
		sign.enter_firstname("selenium");
		sign.enter_lastname("java");
		
		sign.select_day("15");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		sign.click_signupbttn();
		
	}
	
}
