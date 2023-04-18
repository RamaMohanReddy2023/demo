package demo.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Linkedin {
  public static void main (String []args) throws InterruptedException {
//        testLogin();
          testNaukriHeaders();
//        System.out.println(data);
}
public static void testLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\drivers\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
     driver.get("https:\\demo.automationtesting.in");
     driver.findElement(By.id("btn2")).click();
     driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Testing");
     driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("User");
     driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("ramohanreddy31@gmai.com");
     driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9696969696");
     driver.findElement(By.xpath("//input[@value='FeMale']")).click();
     driver.findElement(By.id("checkbox2")).click();
     driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
     driver.findElement(By.xpath("//li[@role='treeitem'][6]")).click();
     Thread.sleep(2000);
     WebElement yearbox = driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
     Select yearboxdd = new Select(yearbox);
     Thread.sleep(1000);
     yearboxdd.selectByVisibleText("2000");
     WebElement monthbox = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
     Thread.sleep(1000);
     Select monthbox1 = new Select(monthbox);
     monthbox1.selectByVisibleText("January");
     WebElement daybox = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
     Thread.sleep(1000);
     Select daybox1 = new Select(daybox);
     daybox1.selectByVisibleText("6");
     driver.findElement(By.id("firstpassword")).sendKeys("Lakshmi@2016");
     driver.findElement(By.id("secondpassword")).sendKeys("Lakshmi@2016");
     driver.findElement(By.id("submitbtn")).click();
}       



public static void testNaukriHeaders() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\drivers\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.naukri.com/");
    String naukriPageTitile = driver.getTitle();
    System.out.println("Page Title -----> "+naukriPageTitile);
    
    String pageUrl = driver.getCurrentUrl();
    System.out.println("Page current URL ---->          "+pageUrl);
    
    WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
    System.out.println("Jobs Text --->  "+jobs.getText());
    
    WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
    System.out.println("Companies Text --->  "+companies.getText());
    
    Actions action = new Actions(driver);
    action.moveToElement(jobs).build().perform();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
    Thread.sleep(5000);
    System.out.println("Page Title ---->   "+driver.getTitle());
    
//    System.out.println("Page Source ---->  "+driver.getPageSource());

    driver.quit();
    System.out.println("Driver session ID ----> "+driver);
    
    
}

}