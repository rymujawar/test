package riyaj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrac {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		driver.manage().window().maximize();
//		WebElement EmailText = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]"));
//		EmailText.sendKeys("rymujawar@gmail.com");
//		boolean RegisterTxt = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']/parent::div/h1")).isDisplayed();
//		System.out.println("RegisterTxt present: "+RegisterTxt);
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type=\"text\"]")).sendKeys("rym@gmail.com");
//		driver.quit();
		
	}

}
