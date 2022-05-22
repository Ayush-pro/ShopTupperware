package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartItemPage
{
	private By RemoveLocator=By.xpath("//*[@id=\'shopping-cart-table\"]/tbody[2]/tr[2]/td/div/a[2]']");
	private By AcceptLocator=By.xpath("//button[@id=\'product-addtocart-button\']");
	private By MessageLocator=By.xpath("//**[@id=\'maincontent\']");
	private WebDriver driver;
	
	public AddToCartItemPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnRemove() 
	{
		driver.findElement(RemoveLocator).click();
	}
	
	public void clickOnAccept() 
	{
		driver.findElement(AcceptLocator).click();
	}
	
	public String Message() 
	{
		return driver.findElement(MessageLocator).getText().trim();
		
	}
}
