package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]//a")).click();
//		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9011843239");
		driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
		Thread.sleep(3000);
//		WebElement frm = driver.findElement(By.xpath("//div[@id='px-captcha']"));
		driver.switchTo().frame("pZnECGAMlbGBSBJ");
		Actions actions =new Actions(driver);
		actions.clickAndHold();
		Thread.sleep(9000);
		actions.release();
		
		
		

	}

}
