package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase extends ExcelUtility
{
   public static WebDriver driver;
  
   
   
   
   public void initialization(String browser,String url)

   {
			if(browser.equalsIgnoreCase("chrome"))	
			{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			
			}
			
			driver.manage().deleteAllCookies();
		
			driver.get(url);
		}
   public void sleep() throws InterruptedException
   {
	   Thread.sleep(4000);
   }

   }
	

