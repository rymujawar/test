package test;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakeMyTripBooking {

	public static void main(String[] args) throws InterruptedException {
		

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to MakeMyTrip web-site
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		}

}
