package com.inetBankingV1.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.Logindetails;
import com.inetbanking.resources.Base;

public class TC_LoginDp_002 extends Base 
{
  public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@Test(dataProvider="getData")
	public void loginDp(String user,String pwd) 
	{
		driver.get(prop.getProperty("url"));
		log.info("url is opened");
		Logindetails ld1=new Logindetails(driver);
		ld1.setUserid().sendKeys(user);
		log.info("userid is given");
		ld1.setPassword().sendKeys(pwd);
		log.info("password is given");
		ld1.clickSubmitt().click();
		log.info("click on button");
		
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			ld1.clickLogout().click();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
	}
		
	public boolean isAlertPresent()//user defined method
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
		
	
		
		
	
     
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="mngr239099";
		data[0][1]="YtAmupe";
		
		data[1][0]="mngr23909";
		data[1][1]="YtAmup";
	
		return data;
		
	}
	
	
}
