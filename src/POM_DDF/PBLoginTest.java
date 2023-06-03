package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream file=new FileInputStream("G:\\Velocity Testing\\PolicyBazaar.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignIn();
		
		PBMobNumPage mobnum=new PBMobNumPage(driver);
		String MobNum = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inputPBMobNumPageMobNum(MobNum);
		mobnum.cliclPBMobNumPageSignInWithPwd();
		
		PBPwdPage pwd=new PBPwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inputPBPwdPagePWD(password);
		pwd.clickPBPwdPageSignIn();
		
		PBHomePage home=new PBHomePage(driver);
		home.OpenDDPBHomePageMyAcc();
		
		PBMyAccPage myAcc=new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageMyProfile();
		
		PBProfilePage profile=new PBProfilePage(driver);
		profile.swithToChildWindow();
		String name = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePageFullName(name);
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
