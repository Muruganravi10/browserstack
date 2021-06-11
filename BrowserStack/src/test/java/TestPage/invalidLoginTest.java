package TestPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Drivers.ExcelUtility;
import Drivers.TestBase;
import Pages.invalidLogin;

public class invalidLoginTest extends TestBase{

	public String browser = "chrome";
	 public String url = "https://www.browserstack.com/users/sign_up";
	 String sheetName="invalidLogin";
	 
	 invalidLogin valid;

	 
	public invalidLoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization(browser, url);
		valid = new invalidLogin();
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
		String errormsg =valid.eMailerror();
		Assert.assertEquals("Invalid Email", errormsg);
		System.out.println(valid.eMailerror());
		valid.box();
		String errormsg2 = valid.passWorderror();
		Assert.assertEquals("At least 6 characters", errormsg2);
		System.out.println(valid.passWorderror());
	
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
