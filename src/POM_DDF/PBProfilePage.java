package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{

	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void swithToChildWindow()
	{
		Set<String> allIDs = driver1.getWindowHandles();
		ArrayList<String> a1=new ArrayList<>(allIDs);
		driver1.switchTo().window(a1.get(1));
	}
	public void verifyPBProfilePageFullName(String expName)
	{
		String actName = fullName.getAttribute("value");
		
		if(actName.equals(expName))
		{
			System.out.println("TC Pass");
		}
		else
		{
		System.out.println("TC Fail");	
		}
	}
	
	
}
