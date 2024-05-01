package seleniumTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.out.println("Enter browser name:");
		Scanner sc =new Scanner(System.in);
		String BrowserName=sc.next();
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			driver =new ChromeDriver(); //Launch chrome Browser

		}
		else if (BrowserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver(); //Launch FireFox Browser
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //open URL
		driver.manage().window().maximize();	// maximize the window
		Thread.sleep(3000);	// wait for 3 seconds to load the page.
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
		Thread.sleep(3000);
		String rtext = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		System.out.println(rtext);
		if (rtext.equals("Dashboard"))
		{
			System.out.println("Dashboard text test passed");
		}
		else
		{
			System.out.println("Dashboard test failed");
		}
		//		driver.close();
		driver.quit();
	}

}
