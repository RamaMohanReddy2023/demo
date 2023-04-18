package demo.naukri;

import org.openqa.selenium.By;

public class PDP extends BaseClass {
	private By ADDTOCART_BUTTON = By.xpath("//a[@class='shopping_cart_link']");
	
	
	public void cartButton() {
		driver.findElement(ADDTOCART_BUTTON).isDisplayed();
		driver.findElement(ADDTOCART_BUTTON).click();
	}
}
