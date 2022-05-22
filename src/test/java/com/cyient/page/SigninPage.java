package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage 
{
	private By clickLocator = By.id("send2");
	
	private WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnLogin() 
	{
		driver.findElement(clickLocator).click();
		
	}


}
