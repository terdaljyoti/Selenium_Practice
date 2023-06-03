package POM_With_PageFactory1;
//pom class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIN;
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cilckOnSignInBtn() 
	{
		SignIN.click();
		
	}
	 

}
