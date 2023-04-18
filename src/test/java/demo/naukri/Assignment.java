package demo.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	
public static void main(String[]args) throws InterruptedException {
		testMouseover();
	}
		
	public static void testMouseover() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\drivers\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.naukri.com");
 WebElement Companies = driver.findElement(By.xpath("//div[text()='Companies']")); 
 Actions company = new Actions (driver);
 company.moveToElement(Companies).build().perform();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[text()='MNC']")).click();
  WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));
  
  
		
	}
	

}
