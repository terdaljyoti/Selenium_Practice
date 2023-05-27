package HandlingOfAutoSugetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		 Thread.sleep(2000);
		 List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		 String exp_text="redmi 12c";
		 for(WebElement s:allOptions)
		 {
			 String act_text = s.getText();
			 if(act_text.equalsIgnoreCase(exp_text))
			 {
				 s.click();
				 break;
			 }
		 }
		 
	}
}
