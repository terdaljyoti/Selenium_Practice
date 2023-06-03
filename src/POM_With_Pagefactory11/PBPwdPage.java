package POM_With_Pagefactory11;
//pom class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{
	@FindBy(xpath="//input[@id='central-login-password']")private WebElement pwd;
	@FindBy(xpath="//a[@id='login-in-with-password']")private WebElement SignIN;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	public void EnterPwd()
	{
		pwd.sendKeys("jyoti@123");
	}
	public void ClickOnSignInBtn()
	{
	
		SignIN.click();
	}
}
