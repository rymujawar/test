package riyaj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement frm=driver.findElement(By.xpath("//div[@role=\"button\"]/descendant::input[@id='src']"));
		frm.sendKeys("Latur");
		driver.findElement(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li//text[text()='Latur']")).click();
		driver.findElement(By.xpath("(//div[@role=\"button\"])[2]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/child::li[1]")).click();
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
//		
	}
}
