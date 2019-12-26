package com.inetBankingV1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddCustomerPage {
	
public WebDriver driver;

By Newcustomer=By.linkText("New Customer");

By Name=By.name("name");
By Gender=By.xpath("//input[@value='f']");
By DateOfBirth=By.name("dob");
By Address=By.name("addr");
By City=By.name("city");
By State=By.name("state");
By Pin=By.name("pinno");
By MobileNumber=By.name("telephoneno");
By Email=By.name("emailid");
By Password=By.name("password");
By Submit=By.name("sub");



public AddCustomerPage(WebDriver driver) {
	this.driver=driver;
}

public WebElement gettNewCustomer()
{
	return driver.findElement(Newcustomer);
}
public WebElement getName()
{
	return driver.findElement(Name);
}

public WebElement getGender()
{
	return driver.findElement(Gender);
	
}
public WebElement getDateOfBirth()
{
	return driver.findElement(DateOfBirth);
	
}
public WebElement getAddress()
{
	return driver.findElement(Address);
}
public WebElement getCity()
{
	return driver.findElement(City);
}
public WebElement getState()
{
	return driver.findElement(State);
}
public WebElement getPin()
{
	return driver.findElement(Pin);
}
public WebElement getMobileNumber()
{
	return driver.findElement(MobileNumber);
}
public WebElement getEmail()
{
	return driver.findElement(Email);
}
public WebElement getPassword()
{
	return driver.findElement(Password);
}
public WebElement getSubmit()
{
	return driver.findElement(Submit);
}
}
