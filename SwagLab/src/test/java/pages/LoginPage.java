package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Load the elements which are required for testing
//doing action using these elements

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
	@FindBy(id="user-name")
	WebElement usernameElement;
	
	@FindBy(id="password")
	WebElement PassElement;
	
	@FindBy(id="login-button")
	WebElement LoginBtnElement;
	
	
	public void setUserName(String uername)
	{
		usernameElement.sendKeys(uername);
	}
	
	public void setPassword(String Password)
	{
		PassElement.sendKeys(Password);
	}
	
	public void clickLoginButton()
	{
		LoginBtnElement.click();
	}

	
		
	

}
