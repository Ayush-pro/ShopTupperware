package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage 
{
	private By FirstNameLocator=By.id("firstname");
	private By LastNameLocator=By.id("lastname");
	private By EmailLocator=By.id("email");
	private By PasswordLocator=By.id("password");
	private By ConfirmPasswordLocator=By.id("password-confirmation");

	private By ErrorMsgLocator=By.xpath("//*[contains(text(),'Please')]");
	private WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sendFirstName(String firstName) 
	{
		driver.findElement(By.id("firstname")).sendKeys(firstName);
	}
	
	public void sendLirstName(String lastName) 
	{
		driver.findElement(LastNameLocator).sendKeys(lastName);
	}
	
	public void sendEmail(String email) 
	{
		driver.findElement(EmailLocator).sendKeys(email);
	}
	
	public void sendPassword(String password) 
	{
		driver.findElement(PasswordLocator).sendKeys(password);
	}
	
	public void sendconfirmPassword(String password-confirmation) 
	{
		driver.findElement(ConfirmPasswordLocator).sendKeys(password-confirmation);
	}

	public String errorMessage() 
	{
		return driver.findElement(ErrorMsgLocator).getText().trim();
		
		
	}

}
