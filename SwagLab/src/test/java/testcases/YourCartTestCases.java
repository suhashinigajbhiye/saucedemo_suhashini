package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.YourCartPage;
import utility.BaseClass;

public class YourCartTestCases extends BaseClass {
	
	
	
	@Test
	
	void YourCart()
	{

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("cart 1");
		
		
		YourCartPage yc= new YourCartPage(driver);
		System.out.println("cart2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		yc.AddToCart();
		System.out.println("cart3");
		yc.shopping_cart();
		System.out.println("cart4");
		yc.Title();
		System.out.println("cart5");
		yc.ItemName();
		
		System.out.println("cart6");
		yc.Checkout();
		System.out.println("cart 7 ");
		
	}
	

}
