package testing;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class lenskart {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		//launch browser
		driver.get("https://www.lenskart.com/");
		//maximize the window
		driver.manage().window().maximize(); 
		//Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on input box
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for?']")).click();
//		click on drop down otion-Sunglasses
		driver.findElement(By.xpath("//ul[@class='UL--wdbnwf jvsifO']//a[normalize-space()='Sunglasses']")).click();
		//Print the status.
		System.out.println("auto-Suggestion from dropdown test for sunglasses passed");

	}

}
