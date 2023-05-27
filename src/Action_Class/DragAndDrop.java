package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement srcEle = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement destEle = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act=new Actions(driver);
//		act.dragAndDrop(srcEle, destEle).perform();
	
//		act.clickAndHold(srcEle).moveToElement(destEle).release().perform();
		
		act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().perform();		
	}

}
