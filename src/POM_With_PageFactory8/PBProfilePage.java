package POM_With_PageFactory8;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{
	@FindBy(xpath="//input[@name='personName']")private WebElement FullName;
	WebDriver driver1;
	public PBProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void SwitchToChildWindow()
	{
		 
		Set<String> allIDs = driver1.getWindowHandles();
		ArrayList<String> a1=new ArrayList<>(allIDs);
		driver1.switchTo().window(a1.get(1));
	}
	
	public void verifyFullName() throws InterruptedException
	{
		String act_text = FullName.getAttribute("value");
		String exp_text="jyoti";
		
		if(act_text.equals(exp_text))
		{
			System.out.println("TC Pass");
		}
		else
		{
		System.out.println("TC Fail");	
		
		}


	}

}
