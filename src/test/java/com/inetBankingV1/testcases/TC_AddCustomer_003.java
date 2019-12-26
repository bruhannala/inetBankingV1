package com.inetBankingV1.testcases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.AddCustomerPage;
import com.inetBankingV1.pageObjects.Logindetails;
import com.inetbanking.resources.Base;

import junit.framework.Assert;

public class TC_AddCustomer_003 extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("url is opened ");
		Logindetails ld=new Logindetails(driver);
		ld.setUserid().sendKeys(prop.getProperty("UserId"));
		log.info("username is entered ");
		ld.setPassword().sendKeys(prop.getProperty("Password"));
		log.info("password is entered ");
		ld.clickSubmitt().click();
		log.info("click on submit");
		
		AddCustomerPage ad =new AddCustomerPage(driver);
		ad.gettNewCustomer().click();
		log.info("click on new customer");
		ad.getName().sendKeys("KishoreReddy");
		log.info("entered name");
		ad.getGender().click();
		log.info("gender selected ");
	
		ad.getDateOfBirth().sendKeys("17-06-1989");
		Thread.sleep(3000);
		log.info("dateofbirth entered");
		ad.getAddress().sendKeys("Giddalur,Prakasham District");
		log.info("address entered");
		ad.getCity().sendKeys("Hyderabad");
		log.info("city name is given");
		ad.getState().sendKeys("Telangana");
		log.info("state name is given");
		ad.getPin().sendKeys("523357");
		log.info("pincode is given ");
		ad.getMobileNumber().sendKeys("9967584534");
		log.info("mobile no is entered ");
		
		ad.getEmail().sendKeys("chanti7kishore@gmail.com");
		log.info("mail to give");
		ad.getPassword().sendKeys("kumarijelli");
		log.info("password is entered");
		ad.getSubmit().click();
		
		log.info("click on submit");
		
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
		
    
		
		
	}


