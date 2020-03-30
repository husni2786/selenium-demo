package com.pages;

import java.util.logging.Logger;

public class SimpleDemo 
{

	WebDriver driver;
	Logger LOG = Logger.getLogger( SimpleDemo .class.getName());
	By username =By.id("txtUsername");
	By password =By.id("txtPassword");
	By loginbtn = By.xpath("//*[@id=\'btnLogin\']");
	
	public LoginOrangeHRM(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	public void login_username(String userid)
	{
		driver.findElement(username).sendKeys(userid);
		LOG.info("Entered Name in the UserName Field");
	}
	public void login_password(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
		LOG.info("Entered Password in the Password Field");
	}
	public void login_button()
	{
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loginbtn)));
		driver.findElement(loginbtn).click();
		LOG.info("Clicked Login Button");
	}	
	
	
	
	
}
