package riyaj;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Shirt");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		WebElement win=driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2\']//a[1]/span[1]"));
		win.click();
		
		
		Set<String> windids=driver.getWindowHandles();//p&C
		
		Iterator<String> it=windids.iterator();
		String childWin = it.next();
		String child1Win = it.next();

		driver.switchTo().window(childWin);
		driver.switchTo().window(child1Win);
		
//		WebElement cartbtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		WebElement cartbtn = driver.findElement(By.xpath("//a[@title=\"Add to Cart\"]"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	    wait.until(ExpectedConditions.visibilityOf(cartbtn));
	    cartbtn.click();
//		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
//		driver.findElement(By.xpath("//input[@id=\"continue\"]")).sendKeys("9011843239");
	     
		
	}

}
