package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{

	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement MobNum;
	@FindBy(xpath="(//span[contains(text(),'Password')])[2]")private WebElement signInWithPwd;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	public void inputPBMobNumPageMobNum(String mobno)
	{
		MobNum.sendKeys(mobno);
	}
	
	public void cliclPBMobNumPageSignInWithPwd()
	{
	
		signInWithPwd.click();
	}
}
