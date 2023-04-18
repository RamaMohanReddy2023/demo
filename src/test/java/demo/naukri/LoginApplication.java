package demo.naukri;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginApplication extends BaseClass {
	private By USER_EMAIL = By.xpath("//input[@type='text']");
	private By USER_PASSWORD = By.xpath("//input[@type='password']");
	private By LOGIN_BUTTON = By.xpath("//input[@type='submit']");
	
	
	
	public void loginApp(String username,String password) {
    	driver.get("https://www.saucedemo.com/");
  		driver.findElement(USER_EMAIL).sendKeys(username);
  		Assert.assertTrue(driver.findElement(USER_EMAIL).isDisplayed());
  		driver.findElement(USER_PASSWORD).sendKeys(password);
  		driver.findElement(LOGIN_BUTTON).click();
  		
      }
      
	    public boolean isLoginButtonLocated() {
	    	boolean Login = driver.findElement(LOGIN_BUTTON).isDisplayed();
	    	return Login;
	    	
	    }
	

}
