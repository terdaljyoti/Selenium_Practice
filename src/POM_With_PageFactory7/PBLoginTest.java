package POM_With_PageFactory7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.ClickOnSignInBtn();
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		mobNum.EnterMobNum();
		mobNum.ClickOnSignInWithPwdBtn();
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.EnterPwd();
		pwd.ClickOnSignIn();
		
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.OpenMyAccDropDown();
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
		myacc.ClickOnMyProfileBtn();
		
		PBProfilePage profile =new PBProfilePage(driver);
		profile.SwitchToChildWindow();
		Thread.sleep(2000);
		profile.verifyFullName();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
