package com.cyient.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddNewAddress {


		private String StreetAddress="street_1";
		private By addNewAddressLocator = By.id("save-address_btn1");
		

		private WebDriver driver;
		
		public AddNewAddress(WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		public void switchToFinFrame()
		{
			driver.switchTo().frame(StreetAddress);
		}
		
		public void clickOnAddNewAddress()
		{
			driver.findElement(addNewAddressLocator).click();
		}
		
		public void switchOutOfFrame()
		{
			driver.switchTo().defaultContent();
		}
	}



