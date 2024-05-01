package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jamil {
public static void main(String[] args) {
        //very important
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        List<WebElement> list=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div"));
        System.out.println(list.size());
        
        //Set<String> windowsIDs=driver.getWindowHandles();
        //String title=driver.getTitle();
        //System.out.println(title);
        
        for(WebElement lists:list)
        {
            System.out.println(lists.getText());
            System.out.println(lists.getAttribute("a"));
        }
        
    }

}
