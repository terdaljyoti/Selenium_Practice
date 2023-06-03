package POM_With_PageFactory12;
//pom class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;
	
	public PBLoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);

	}
	public void ClickONSignInBtn()
	{
	
		SignIn.click();
	}
	
}
