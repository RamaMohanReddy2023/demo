package demo.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {
	private By BACKPACK_TOCART = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	private By BIKELIGHT_TOCART= By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");
	private By REDTSHIRT_TOCART= By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']");
	private By ADDTOCART_BUTTON = By.xpath("//a[@class='shopping_cart_link']");
	private By CART_BUTTON = By.xpath("//a[@class='shopping_cart_link']");
	private By LOGOUT_BUTTON = By.xpath("//a[@href='/logout']");
	
	public void AddToCart() {	
		driver.findElement(BACKPACK_TOCART).isDisplayed();
		driver.findElement(BACKPACK_TOCART).click();
		driver.findElement(BIKELIGHT_TOCART).isDisplayed();
		driver.findElement(BIKELIGHT_TOCART).click();
		driver.findElement(REDTSHIRT_TOCART).isDisplayed();
		driver.findElement(REDTSHIRT_TOCART).click();
		
	}

	 public void OpenCart() {
		 
		 driver.findElement(CART_BUTTON).isDisplayed();
		 driver.findElement(CART_BUTTON).click();
	 }
	public void LogOutApp () {
		waitForElement(LOGOUT_BUTTON);
		driver.findElement(LOGOUT_BUTTON).isDisplayed();
		driver.findElement(LOGOUT_BUTTON).click();
	}
}
