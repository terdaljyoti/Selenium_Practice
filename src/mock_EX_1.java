import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock_EX_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flowlu.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("(//a[@target='_blank'])[19]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Free')])[13]")).click();
		
		
		
	}

}
