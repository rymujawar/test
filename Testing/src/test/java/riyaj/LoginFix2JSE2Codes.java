package riyaj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LoginFix2JSE2Codes {
	public static void clickElementByJS(WebElement element,WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", element);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
//		WebDriver driver =new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
		
		// Java program to get an element by XPath 
		// using JavaScript in Selenium WebDriver 
 
				WebDriver driver = new ChromeDriver(); 
				driver.get("https://www.makemytrip.com/"); 
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9011843239");
				Thread.sleep(5000);
				//Actions actions =new Actions(driver);
				WebElement Continuebtn = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
				//actions.moveToElement(Continuebtn).click();
				
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click();", Continuebtn);
				
				
				//LoginFix2JSE2Codes.clickElementByJS(reglink, driver);
				
	
		
		
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9011843239");
//		
//		// submit form
//	      WebElement btn = driver.findElement(By.xpath("//button[@class='capText font16']\")).submit()"));
//	      btn.click();
//
//		
//		//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).submit();
//		//driver.findElement(By.xpath("//button[@class='capText font16']")).submit();
//		//
////		WebElement rootNode=driver.findElement(By.xpath("//button[@class=\'capText font16\' and @type=\'button\']"));
////		Actions act = new Actions (driver);
////	
////		act.click(rootNode).perform();
//////		act.click(rootNode).build().perform();
//
//		
//		driver.quit();
		
	}
	
}
