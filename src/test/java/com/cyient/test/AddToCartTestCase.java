package com.cyient.test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.AddToCartItemPage;
import com.cyient.page.AddToCartPage;
import com.cyient.page.SigninPage;
import com.cyient.utilities.DataProviderUtilities;

public class AddToCartTestCase extends WebDriverWrapper
{
	@Test
	public void AddToCartTest() throws Exception 
	{  
	
		SigninPage Dslr=new SigninPage (driver);
		//Tab Change
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		
		
		AddToCartPage Cart=new AddToCartPage(driver);
		Thread.sleep(5000);
		Cart.clickOnAddToCart();
		Thread.sleep(5000);
		
		
		AddToCartItemPage item=new AddToCartItemPage(driver);

		item.clickOnRemove();
		Thread.sleep(5000);
		item.clickOnAccept();
		
		Assert.assertEquals(item.Message(),"Your Shopping Cart is Empty");
		
		
		
		
	
		}


	}

