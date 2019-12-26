package com.inetBankingV1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logindetails {
	
	public WebDriver driver;
	
	By userid=By.name("uid");
	By password=By.name("password");
	By login=By.name("btnLogin");
	By logout=By.linkText("Log out");
	
    
	
	public Logindetails(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement setUserid()
	
	{
		return driver.findElement(userid);
	}
	
     public WebElement setPassword()
	
	{
		return driver.findElement(password);
	}

    public WebElement clickSubmitt()

    {
	return driver.findElement(login);
    }
    
    public WebElement clickLogout()

    {
	return driver.findElement(logout);
    }
}
