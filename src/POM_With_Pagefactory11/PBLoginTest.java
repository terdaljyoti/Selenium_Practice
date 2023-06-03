package POM_With_Pagefactory11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.ClickOnSignInBtn();
		
		PBMobNumPage MobNum=new PBMobNumPage(driver);
		MobNum.EnterMobnum();
		MobNum.ClickOnSignInWithPwdBtn();
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.EnterPwd();
		pwd.ClickOnSignInBtn();
		
		PBHomePage home=new PBHomePage(driver);
		home.OpenMyAccDropDown();
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
		myacc.ClickOnMyProfile();
		
		PBProfilePage profile=new PBProfilePage(driver);
		profile.SwithToChildWindow();
		profile.VerifyFullName();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
