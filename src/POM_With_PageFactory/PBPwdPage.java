package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage
{ 
	//pom class 3
	
	@FindBy(xpath="//input[@id='central-login-password']")private WebElement pwd;
	@FindBy(xpath="//a[@id='login-in-with-password']")private WebElement SignIn;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPwd()
	{
		pwd.sendKeys("jyoti@123");
	}
	public void ClickOnSignIn()
	{
		SignIn.click();
	}
	
}
