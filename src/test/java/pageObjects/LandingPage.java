package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public By search = By.xpath("//input[@type='search']");
	public By productName = By.cssSelector("h4.product-name");
	By link_topDeals = By.linkText("Top Deals");
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void linkTopDealClick() {
		driver.findElement(link_topDeals).click();
	}
}
