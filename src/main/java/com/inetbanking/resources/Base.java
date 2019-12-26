package com.inetbanking.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public Properties prop;

	
	@BeforeClass
	public void setUp() throws IOException
	{
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void data() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kishore\\eclipse-workspace\\inetBankingV1\\configurations\\data.properties");
		prop.load(fis);
		
		
	 }
	
	@AfterClass
	public void tearDown()
	{
	   driver.quit();
	}
	
	public String randomstring()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(9); 
    	return generatedstring;
    }
	
	
	
	public void getScreenshot(String result) throws IOException
	{
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2=new File("./inetBankingV1"+result+"screenshot.png");
		Files.copy(f1, f2);
				
	}

}
