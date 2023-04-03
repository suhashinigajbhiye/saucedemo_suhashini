package utility;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;
// load all the basic requirement
public class BaseClass {
	ReadConfigu read =new ReadConfigu();
	protected  String global_username=read.getUsername();
	protected  String global_password=read.getPassword();
	protected  String url=read.getUrl();
	protected  String browser=read.getBrowser();
	public static Logger log;
	protected static WebDriver driver;
	
	@BeforeTest
	public void setup() 
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
		}
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		log = Logger.getLogger("SwagLab");
		PropertyConfigurator.configure("logfile.properties");
	}
	
	@AfterTest
	public void tear()
	{
		driver.quit();
	}

}
