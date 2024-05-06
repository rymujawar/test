package riyaj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.icicibank.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement reglink = driver.findElement(By.xpath("//span[normalize-space()='Insurance']"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();", reglink);
		WebElement status= driver.findElement(By.xpath("//span[@class=\"orange-linear-gradient\" and normalize-space()='Insurance']"));
//		System.out.println("Insurance is dispayed: "+status.isDisplayed());
//		Actions actions =new Actions(driver);
//		actions.click().perform();
	}

}
