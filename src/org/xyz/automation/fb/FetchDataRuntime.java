package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();    //launch the browser
		
		String ExpURL = "https://www.facebook.com/";
		
		
		
		driver.get(ExpURL);
		driver.manage().window().maximize();
		
		String ActURL = driver.getCurrentUrl();  //fetching the URL
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //hard assertion
		//Assertion 2 types - hard assertion and soft assertion 
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);  
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle,ExpTitle);
		
		String ExpUname = "Email address or phone number";
		
		String ActUName = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUName);
		
		sa.assertEquals(ActUName, ExpUname);
		
		String ExpLogin = "Log in";
		String ActLogin = driver.findElement(By.name("login")).getText();
		System.out.println(ActLogin);
		
		sa.assertEquals(ActLogin, ExpLogin);
		
		Point GetLoc = driver.findElement(By.name("login")).getLocation();
		System.out.println(GetLoc);
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		
		sa.assertAll();
	}
	
	
}
