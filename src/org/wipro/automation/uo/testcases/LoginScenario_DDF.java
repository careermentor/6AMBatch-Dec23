package org.wipro.automation.uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.uo.datagenerator.TestDataGenerator;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="sample", dataProviderClass=TestDataGenerator.class)
	public void validateloginfunc1(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}

	
	
	
}
