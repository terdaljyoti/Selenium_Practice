import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mock_EX_2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://fluentcrm.com/blog/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Resources']")).click();


		       
	}

}
