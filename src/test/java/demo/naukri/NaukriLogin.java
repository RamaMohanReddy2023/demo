package demo.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriLogin {
	public static void main(String[] args) throws Exception {
		testLogin();
	}
	
	public static void testLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("Rama MOhan Reddy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
