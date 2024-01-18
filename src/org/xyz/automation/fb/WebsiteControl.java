package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebsiteControl 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();    //launch the browser
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement y = driver.findElement(By.name("fld_username"));
		
		y.sendKeys("modisantosh@gmail.com");
		
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		driver.findElement(By.cssSelector("[value='office']")).click();  //radio button
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		boolean ActState1 = driver.findElement(By.name("terms")).isSelected();
		
		Assert.assertEquals(ActState1, false);
		
		driver.findElement(By.name("terms")).click();  //checkbox
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		boolean ActState2 = driver.findElement(By.name("terms")).isSelected();
		Assert.assertEquals(ActState2, true);
		
		System.out.println(driver.findElement(By.cssSelector("[value='Sign up']")).isDisplayed());
		
	//	driver.findElement(By.className("displayPopup")).click();  //link
		
		WebElement x = driver.findElement(By.name("sex"));
		
		Select gen = new Select(x);
		
		//gen.selectByIndex(1);  //Male
		//gen.selectByValue("2");  //Female
		gen.selectByVisibleText("Male");
		//gen.deselectAll();
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("Australia");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Auckland"));
		
		st.selectByVisibleText("Melbourne");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Melbourne"));
		
		ct.selectByVisibleText("Melbourne");
		
		
		
	//	driver.quit(); //will close all the window
		
	}
}
