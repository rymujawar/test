package riyaj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LoginFix {

	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeOptions options =new ChromeOptions();
//		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9011843239");
		
		// submit form
	     driver.findElement(By.xpath("//button[@class='capText font16']"));
	      Actions actions =new Actions(driver);
			actions.click().perform();

		
		//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).submit();
		//driver.findElement(By.xpath("//button[@class='capText font16']")).submit();
		//
//		WebElement rootNode=driver.findElement(By.xpath("//button[@class=\'capText font16\' and @type=\'button\']"));
//		Actions act = new Actions (driver);
//	
//		act.click(rootNode).perform();
////		act.click(rootNode).build().perform();

		
		driver.quit();
		
	}
	
}
