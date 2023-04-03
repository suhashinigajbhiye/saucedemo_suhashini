package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
	
	
	
	WebDriver ldriver;
	public YourCartPage(WebDriver driver)
	{
		
		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement AddToCartElement;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement shopping_cartElement;
	
	@FindBy(xpath="//span[@class='title']")
	WebElement TitleElement;
	
	              
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
	WebElement ItemNameElement;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement CheckoutElement;
	
	
	public void AddToCart()
	{
		AddToCartElement.click();
	}

	public void shopping_cart()
	{
		shopping_cartElement.click();
	}
	
	public void Title()
	{
		TitleElement.isDisplayed();
	}
	public void ItemName()
	{
		ItemNameElement.isDisplayed();
	}
	
	
	
	public void Checkout()
	{
		CheckoutElement.click();
	}
	

}
