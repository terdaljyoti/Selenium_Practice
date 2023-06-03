package POM_With_PageFactory9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 4

public class PBHomePage
{
	@FindBy(xpath="//a[@class='signed signed-desk']")private WebElement MyAcc;
	WebDriver driver1;
	public PBHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void OpenMyAccDropDown() 
	{
		Actions act=new Actions(driver1);
		act.moveToElement(MyAcc).perform();
		
	}

}
