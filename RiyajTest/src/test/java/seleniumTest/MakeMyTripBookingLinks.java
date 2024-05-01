package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class MakeMyTripBookingLinks {

    public static void main(String[] args) throws InterruptedException {
        
       ChromeOptions options =new ChromeOptions();
       options.addArguments("--disable-notification");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to MakeMyTrip website
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter Mobile Number']")).sendKeys("9011843239");
//        driver.findElement(By.xpath("//div[@class='btnContainer appendBottom25']//button[@class='capText font16']")).click();
        // Find and click on the Hotels link to navigate to the Booking screen
        Thread.sleep(5000);
//     WebElement hotelsLink = driver.findElement(By.xpath("//li[@class='menu_Hotels']//span[@data-cy='item-wrapper']"));
//        hotelsLink.click();
//
//        // Get all the links on the Booking screen
//        List<WebElement> bookingLinks = driver.findElements(By.tagName("a"));
//
//        // Print the titles and href attributes of each link
//        System.out.println("List of available links and their titles on Booking screen:");
//        for (WebElement link : bookingLinks) {
//            String title = link.getText().trim();
//            String href = link.getAttribute("href").trim();
//            if (!title.isEmpty() && !href.isEmpty()) {
//                System.out.println("Title: " + title + ", URL: " + href);
//            }
//        }
//
//        // Close the browser session
//        driver.quit();
    }
}
