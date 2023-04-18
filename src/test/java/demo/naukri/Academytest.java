package demo.naukri;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Academytest {
	
  @Test
	public void testlogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement>suggestionsBox = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		for (WebElement option : suggestionsBox) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
			
		}
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//option[@value='option3']")).click();
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
		
        //WindowHandles on opentab
		driver.findElement(By.id("opentab")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println("ID of parentwindow is"+parentwindow);
		String childwindow = driver.getWindowHandle();
		System.out.println("ID of childwindow is "+childwindow);
		Set<String>allWindowIDs = driver.getWindowHandles();
		for (String windowTitle : allWindowIDs) {
			if(!parentwindow.equals(windowTitle)) {
				driver.switchTo().window(windowTitle);
				Thread.sleep(10000);
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentwindow);
		//Alerts
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
        alert.accept();
        //Handling Tables
        driver.findElement(By.xpath("//input[@onclick='displayConfirm()']")).click();
        System.out.println(alert.getText());
        alert.accept();
        List<WebElement>rows= driver.findElements(By.xpath("//table[@name='courses']//tr"));
        System.out.println(rows.size());
        List<WebElement>columns = driver.findElements(By.xpath("//table[@name='courses']//tr/th"));
        System.out.println(columns.size());
        for (int i =1 ; i <= rows.size(); i++) {
        	for (int j = 1; j <=columns.size(); j++) {
        		if(i==1) {
        System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/th["+j+"]")).getText());
        		}
        		else {
        			System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td["+j+"]")).getText());
        		}
			}
        }
       List<WebElement>Row = driver.findElements(By.xpath("//div/table[@id='product']/tbody/tr"));
       System.out.println(Row.size());
       List<WebElement>Column = driver.findElements(By.xpath("//div/table[@id='product']/thead/tr/th"));
       System.out.println(Column.size());
     for (int i = 1; i <=Row.size(); i++) {
    	 for (int j = 1; j <=Column.size(); j++) {
    		 if(i==1) {
    		 System.out.println(driver.findElement(By.xpath("//div/table[@id='product']/thead/tr["+i+"]/th["+j+"]")).getText());
    		 }
    		 else {
    			 System.out.println(driver.findElement(By.xpath("//div/table[@id='product']/tbody/tr["+i+"]/td["+j+"]")).getText());
    		 }
		}
		
	}
	
  } 	
}	
        
		
      
	

