package riyaj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RiyajTest {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		WebElement Bookingpage=driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']"));
		List<WebElement> links =Bookingpage.findElements(By.tagName("a"));//anchor tag
		System.out.println("total number of links present:"+links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText()+"--->"+link.getAttribute("href"));
			
		}
		
		driver.close();
	}

}
