package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{

	@FindBy(xpath="//input[@id='central-login-password']")private WebElement pwd;
	@FindBy(xpath="//a[@id='login-in-with-password']")private WebElement signIn;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputPBPwdPagePWD(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void clickPBPwdPageSignIn()
	{
		signIn.click();
	}
}
