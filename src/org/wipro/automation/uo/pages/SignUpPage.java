package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.uo.utilitiesClass.ReadPropFiles;

public class SignUpPage 
{

	WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_createnewaccountlink() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelementdata("fb_signup_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelementdata("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelementdata("fb_signup_lastname_name"))).sendKeys(lname);
	}
	
	public void select_day(String bday) throws Exception
	{
		Select day = new Select(driver.findElement(By.name(ReadPropFiles.readelementdata("fb_signup_day_name"))));
		day.selectByVisibleText(bday);
	
		
		
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelementdata("fb_signup_signupbttn_name"))).click();
	}
}
