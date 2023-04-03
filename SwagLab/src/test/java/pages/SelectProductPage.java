package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPage {
	
	WebDriver ldriver;
	public SelectProductPage(WebDriver driver)
	{

		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath="//span[@class='title']")
	WebElement TitleElement;
	
	
	//Product Select By Name
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Backpack']")
	WebElement BackpackElement;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement AddToCartElement;
	
	
	

	public void TitleisDisplayed()
	{
		TitleElement.isDisplayed();
	}

	public void BackpackName()
	{
		BackpackElement.click();
	}
	
	public void AddToCart()
	{
		AddToCartElement.click();
	}
	

	
	
	//Product Select By Image
	
	/*@FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
	WebElement ImgBackpackElement;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement AddToCartElement;
	
	public void ImgBackpack()
	{
		ImgBackpackElement.click();
	}
	
	public void AddToCart()
	{
		AddToCartElement.click();
	}*/
	
	
	
	//verify after selecting the product there will be showing details of product or not
	
	@FindBy(xpath="//div[@class='inventory_details_desc large_size']")
	WebElement DetailsElement;
	

	public void DetailsElement()
	{
		DetailsElement.isDisplayed();
	}

}
