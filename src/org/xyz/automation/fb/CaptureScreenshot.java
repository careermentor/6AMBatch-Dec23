package org.xyz.automation.fb;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{


	public static void testResult(WebDriver driver, String fname) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //will take screenshot like "prt sc"
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/" + fname + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
