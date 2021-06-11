package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.TestBase;

public class invalidLogin extends TestBase{

	@FindBy(id="user_full_name")
	WebElement username;
	
	@FindBy(id="user_email_login")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/div[4]/div/div/div")
	WebElement emailerror;
	
	@FindBy(id="user_password")
	WebElement password;	

	@FindBy(xpath="//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/div[5]/div/div/div")
	WebElement passworderror;
	
	@FindBy(xpath="//input[@id='tnc_checkbox']")
	WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"user_submit\"]")
	WebElement signup;
	

	public invalidLogin()
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
	
	public String eMailerror()
	{
		return emailerror.getText();
		
	}
	
	public void passWord(String pass) throws InterruptedException
	{
		password.sendKeys(pass);
		sleep();
	}
	
	public String passWorderror()
	{
		return passworderror.getText();
		
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
