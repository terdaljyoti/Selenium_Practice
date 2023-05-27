package HandlingOfAutoSugetion;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EX_3
{
	public static void action1()
	{
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	//	driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");;
		Thread.sleep(2000);
		List<WebElement> Alloptions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String Exp_text="redmi note 10 kjk";
		for(int i=0;i<=Alloptions.size()-1;i++)
		{
			String Act_text=Alloptions.get(i).getText();
			if(Act_text.equalsIgnoreCase(Exp_text))
			{
				Alloptions.get(i).click();
			//	break;
			}
			else if(!Act_text.equalsIgnoreCase(Exp_text))
			{
			System.out.println("no matching found");	
			}
		}
		
		
		
/*		int i=0;
		while(i<=Alloptions.size()-1)
		{
			String Act_text=Alloptions.get(i).getText();
			if(Act_text.equalsIgnoreCase(Exp_text))
			{
				Alloptions.get(i).click();
				break;
			}
			i++;
		}
*/	/*	int i=0;
		do
		{
		String Act_text=Alloptions.get(i).getText();
		if(Act_text.equalsIgnoreCase(Exp_text))
		{
			Alloptions.get(i).click();
			break;
		}
		i++;
		}
		while(i<=Alloptions.size()-1);
		*/
		}
		
	}


