package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.TestBase;

public class validLogin extends TestBase{
	
	@FindBy(id="user_full_name")
	WebElement username;
	
	@FindBy(id="user_email_login")
	WebElement email;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='tnc_checkbox']")
	WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"user_submit\"]")
	WebElement signup;
	

	public validLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String uname) throws InterruptedException
	{
		username.sendKeys(uname);
	sleep();
	}
	
	public void eMail(String mail) throws InterruptedException
	{
		email.sendKeys(mail);
		sleep();
	}
	
	public void passWord(String pass) throws InterruptedException
	{
		password.sendKeys(pass);
		sleep();
	}
	
	public void box() throws InterruptedException
	{
		checkBox.click();
		sleep();
	}
	
	public void sign()
	{
		signup.click();
	}
}
