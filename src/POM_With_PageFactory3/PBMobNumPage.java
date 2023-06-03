package POM_With_PageFactory3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage
{
	//pom class 2
	
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement MobNum;
    @FindBy(xpath="(//span[contains(text(),'Password')])[2]")private WebElement SignInWithPwd;
    
    public PBMobNumPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    public void EnterMobNum()
    {
    	MobNum.sendKeys("7823832249");
		
	}
    public void ClickOnSignInWithPwdBtn()
    {
    	SignInWithPwd.click();
		
	}
}
