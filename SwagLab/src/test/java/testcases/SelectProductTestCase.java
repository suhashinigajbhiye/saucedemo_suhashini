package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SelectProductPage;
import utility.BaseClass;

public class SelectProductTestCase extends BaseClass{
	
	@Test
	void SelectProduct()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("login before select product");
		
		SelectProductPage sp=new SelectProductPage(driver); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		sp.TitleisDisplayed();
		
		sp.BackpackName();
		
		sp.AddToCart();
		
		sp.DetailsElement();
		System.out.println("slect");
		
		
		System.out.println("slect the product");
		
		
		
	}
	
}
