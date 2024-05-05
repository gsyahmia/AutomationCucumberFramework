package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;

public class GenericUtils {
	WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void SwitchWindowToChild() {
		
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> iterator1= set1.iterator();
		String parentTab = iterator1.next(); //tab[0]
		String childTab = iterator1.next(); //tab[1]
		
		driver.switchTo().window(childTab);
	}
}
