package demo.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPractise {
  WebDriver driver;

	@Test
	public  void testAutomation() {
		browserInitialization();
		loginApp();
	}
	
      public void browserInitialization() {
    	  System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\drivers\\chromedriver.exe");
  		   driver= new ChromeDriver();
  		
      }
      public void loginApp() {
    	driver.get("https://automationexercise.com/");
  		driver.findElement(By.xpath("//a[@href='/login']")).click();
  		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/login']")).isDisplayed());
  		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vijayalakshmi.kdp94@gmail.com");
  		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='email']")).isDisplayed());
  		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Selenium@2022");
  		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed());
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  		Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());
  		
      }
      
}

