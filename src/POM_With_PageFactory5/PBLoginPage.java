package POM_With_PageFactory5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	//pom class 1
	
	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickOnSignInBtn()
	{
		SignIn.click();
	}
}
