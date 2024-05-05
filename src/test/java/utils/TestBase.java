package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() {
		
		if(driver == null) {
			System.out.println("Launch new driver.....");
			System.setProperty("webdriver.chrome.diver", "C:\\Drivers\\chromedriver-win64\\");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
	}
	

}
