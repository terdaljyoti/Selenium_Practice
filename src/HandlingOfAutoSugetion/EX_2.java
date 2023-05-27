package HandlingOfAutoSugetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exp_text = "redmi note 10 pro";
	/*	for(int i=0;i<=alloptions.size()-1;i++)
		{
			String act_text = alloptions.get(i).getText();
			if(act_text.equalsIgnoreCase(exp_text))
			{
				alloptions.get(i).click();
				break;
			}
			
		}
		*/
		
		for(WebElement a:alloptions)
		{
			String act_text = a.getText();
			if(act_text.equalsIgnoreCase(exp_text))
			{
				a.click();
				break;
			}
		}
	}

}
