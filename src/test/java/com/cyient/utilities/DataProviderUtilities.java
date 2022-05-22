package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtilities 
{
	@DataProvider
	public Object [][] userExcelData() throws IOException
	{
		Object[][] main= ExcelUtilities.getSheetIntoObjectArray("src/test/resources/testdata/ShopTupperwareApplication.xlsx", "ValidUserTestData");
		return main;
		
	}
}
