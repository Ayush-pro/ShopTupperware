package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.RegisterPage;
import com.cyient.page.SigninCredentialPage;
import com.cyient.page.SigninPage;
import com.cyient.utilities.DataProviderUtilities;

public class SignupTestCase extends WebDriverWrapper
{
	@Test(dataProvider="userExcelData",dataProviderClass=DataProviderUtilities.class)
	public void signupTest(String firstName, String lastName,String email, String password,String cPassword) throws Exception 
	{
		SigninPage  Signin=new SigninPage (driver);
		Signin.clickOnLogin();
		Thread.sleep(10000);
		SigninCredentialPage  Register=new SigninCredentialPage(driver);
		Register.clickOnregister();
		RegisterPage Register1=new RegisterPage(driver);
		Register1.sendFirstName(firstName);
		Register1.sendLirstName(lastName);
		Register1.sendEmail(email);
		Register1.sendPassword(password);
		Register1.sendconfirmPassword(cPassword);
	
	
		
		Assert.assertEquals(Register1.errorMessage(),"Please agree to the terms and conditions");
		System.out.println(Register1.errorMessage());
		
		
		
	}
}
