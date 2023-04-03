package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.AddressAndContinuePage;
import pages.LoginPage;
import utility.BaseClass;

public class AddressAndContinueTestCases extends BaseClass {
	
	@Test
	
	void AddressAndContinue()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("login before address");
		
		
		
		AddressAndContinuePage ac= new AddressAndContinuePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.AddToCart1();
		System.out.println("adress 1");
		ac.shopping_cart();
		System.out.println("adress 2");
		ac.Checkout();
		System.out.println("adress 3");
		ac.YourInfoisDisplayed();
		System.out.println("adress 41");
		ac.FirstName("Suhashini");
		System.out.println("adress 5");
		ac.LastName("Gajbhiye");
		System.out.println("adress 6");
		ac.PstalCode("34562");
		System.out.println("adress 7");
		ac.Continue();
		System.out.println("adress 8");
		ac.CancelisDisplayed();
		System.out.println("Enter adress and continued");
	}
	
	
	

}
