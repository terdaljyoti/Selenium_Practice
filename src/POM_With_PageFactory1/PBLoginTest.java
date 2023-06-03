package POM_With_PageFactory1;

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
		
		PBLoginPage login =new PBLoginPage(driver);
		login.cilckOnSignInBtn();
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		mobNum.EnterMobNum();
		mobNum.ClickOnSignInWithPwd();
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.EnterPwd();
		
		pwd.ClickONSignInBtn();
		
		
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.OpenMyAccDropDown();
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
		myacc.ClickOnMyProfileBtn();
		
		Thread.sleep(2000);
		
		PBProfilePage profile=new PBProfilePage(driver);
		profile.SwitchToChildWindo();
		profile.VerifyFullName();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
