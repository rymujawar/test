package riyaj;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Shirt");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		WebElement win=driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2\']//a[1]/span[1]"));
		win.click();
		Set<String> windids=driver.getWindowHandles();//p&C
		
		
		//driver.switchTo().window();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
	}

}
