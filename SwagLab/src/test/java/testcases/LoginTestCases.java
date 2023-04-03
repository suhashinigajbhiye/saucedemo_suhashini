package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.BaseClass;
import utility.ExcelUtility;

public class LoginTestCases extends BaseClass{
	
	
	@DataProvider
	Object readData() throws IOException  
	
	
	
	{
		String loc="C:\\Users\\User\\eclipse-workspace\\SwagLab\\resources\\LoginDataResource.xlsx";
		
		ExcelUtility read = new ExcelUtility(loc);
		int rows = read.getRowCount("Sheet1");
		int cols = read.getCellCount("Sheet1", rows);
		
		Object[][] data = new Object[rows][cols];  // creating two dim array
		
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data[i-1][j]= read.getCellData("Sheet1",i, j);
			}
		}
		/*data[0][0]= "standard_user";    data[0][1]= "secret_sauce";   
		data[1][0]= "standard_user";    data[1][1]= "secret"; 
		data[2][0]= "standard";    data[2][1]= "secret_sauce"; 
		data[3][0]= "standard";    data[3][1]= "secret";*/
		
		
		
		
		return data;
	}
	
	

	@Test(dataProvider="readData")
	void verifyUser(String user, String pass)
	{
		System.out.println(user);
		System.out.println(pass);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName(user);
		login.setPassword(pass);
		login.clickLoginButton();
		System.out.println("login");
	}
	

}
