package POM_With_PageFactory1;
//pom class 5

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 5
public class PBMyAccPage
{
 	@FindBy(xpath="//span[text()=' My profile ']")private WebElement MyProfile;
	
 	public PBMyAccPage(WebDriver driver)
 	{
	
 		PageFactory.initElements(driver, this);	 
	
 	}
 	
 	public void ClickOnMyProfileBtn()
 	{
 		MyProfile.click();
		
	}

}
