package riyaj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//section[@data-cy='CommonModal_2']//span[@class='commonModal__close']")).click();
		WebElement bookingPage=driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']"));
		List<WebElement>links=bookingPage.findElements(By.tagName("a"));
		System.out.println(links.size());//9
		for(WebElement link:links)
		{
			System.out.println(link.getText());//Flights
			System.out.println(link.getAttribute("href"));
		}
		driver.quit();
	}
	
}
