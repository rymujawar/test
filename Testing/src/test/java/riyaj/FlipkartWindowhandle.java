package riyaj;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartWindowhandle {

	public static void main(String[] args) throws Exception {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sync
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
		
		Set<String> windIds=driver.getWindowHandles();
		
//		Iterator<String> it=windIds.iterator();
		
//		String childWindow = it.next();
//		String curl = driver.switchTo().window(childWindow).getCurrentUrl();
//		System.out.println(curl);
		
		for(String win:windIds)
		{
			String curl=driver.switchTo().window(win).getCurrentUrl();
			System.out.println(curl);
			if(curl.equalsIgnoreCase("https://corporate.flipkart.net/corporate-home"))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
		}
		
		
		
		

	}

}
