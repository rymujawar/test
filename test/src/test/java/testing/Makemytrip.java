package testing;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		WebElement bokingpage= driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']"));
		List<WebElement> link=bokingpage.findElements(By.tagName("a"));	
		System.out.println("Total links on Booking page are="+link.size());
		
		for(WebElement link1:link)
		{
			System.out.println(link1.getText());
			System.out.println(link1.getAttribute("href"));
		}
		driver.close();
	}
}
