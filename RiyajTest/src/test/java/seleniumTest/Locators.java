package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver =new ChromeDriver(options);
//		driver.get("www.google.com"); //InvalidArgumentException
		
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.xpath("//img[@class='dropTopImg' and @src='https://static1.lenskart.com/media/desktop/img/Apr22/d2.png']")).click();
//		driver.findElement(By.linkText("Personal Loan")).click();
		
	}

}
