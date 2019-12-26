package com.inetBankingV1.testcases;




import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.Logindetails;
import com.inetbanking.resources.Base;

public class TC_Login_001 extends Base  {

public static Logger log=LogManager.getLogger(Base.class.getName());



     @Test
	 public void loginTest() throws IOException
	 { 
    	 driver.get(prop.getProperty("url"));
 		log.info("url is opened");
		Logindetails ld=new Logindetails(driver);
		ld.setUserid().sendKeys(prop.getProperty("UserId"));
		log.info("userid is entered");
		ld.setPassword().sendKeys(prop.getProperty("Password"));
		log.info("password is entered");
		ld.clickSubmitt().click();
		log.info("click on submitt");
	     
		//Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
				
				
				
				
	}

}
