package riyaj;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.className("signin")).click();
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"\\Screenshots\\red.png");
		FileUtils.copyFile(source, target);
	
	}
}