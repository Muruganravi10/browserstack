package TestPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Drivers.ExcelUtility;
import Drivers.TestBase;
import Pages.validLogin;

public class validLoginTest extends TestBase
{

	 public String browser = "chrome";
	 public String url = "https://www.browserstack.com/users/sign_up";
	 String sheetName="validLogin";
	 
	 validLogin valid;

	 
	public validLoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization(browser, url);
		valid = new validLogin();
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = ExcelUtility.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getCRMTestData")
	public void validPageRun(String uname,String mail,String pass) throws InterruptedException
	{
		valid.userName(uname);
		valid.eMail(mail);
		valid.passWord(pass);
		valid.box();
		valid.sign();
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
}
