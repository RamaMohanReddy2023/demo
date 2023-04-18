package demo.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public  static WebDriver driver;
	
	public void browserInitialization() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	public void waitForElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
}
