package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressAndContinuePage {
	
	

	WebDriver ldriver;
	public AddressAndContinuePage(WebDriver driver)
	{

		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Bike Light']")
	WebElement AddToCart1Element;


	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement shopping_cartElement;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement CheckoutElement;
	
	@FindBy(xpath="//span[@class='title']")
	WebElement YourInfoElement;

	@FindBy(xpath="//input[@id='first-name']")
	WebElement FirstNameElement;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LastNameElement;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement PostalCodeElement;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueElement;
	
	//Verify There is cancel option or not
	@FindBy(xpath="//button[@id='cancel']")
	WebElement CancelElement;
	

	public void AddToCart1()
	{
		AddToCart1Element.click();
	}
	
	public void shopping_cart()
	{
		shopping_cartElement.click();
	}
	
	public void Checkout()
	{
		CheckoutElement.click();
	}
	
	
	public void YourInfoisDisplayed()
	{
		YourInfoElement.isDisplayed();
	}
	
	public void FirstName(String Suhashini)
	{
		FirstNameElement.sendKeys(Suhashini);
	}
	
	public void LastName(String Gajbhiye)
	{
		LastNameElement.sendKeys(Gajbhiye);
	}
	
	public void PstalCode(String  var)
	{
		PostalCodeElement.sendKeys(var);
	}
	
	public void Continue()
	{
		ContinueElement.click();
	}
	

	public void CancelisDisplayed()
	{
		CancelElement.isDisplayed();
	}

}
