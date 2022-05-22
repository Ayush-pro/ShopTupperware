package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	private WebDriver driver;
	private By clickOnAddToCartLocator=By.xpath("//button[@id='amasty-shopby-product-list\']");
	
	
	public AddToCartPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnAddToCart() 
	{
		driver.findElement(clickOnAddToCartLocator).click();
	}
}
