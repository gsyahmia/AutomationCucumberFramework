package stepDefenitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

	public WebDriver driver;
	public String landingPageProductNm;
	public String offerPageProdNm;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	
	public LandingPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() {
		testContextSetup.testBase.WebDriverManager();
		}
	
	
	@When("User searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		landingPage.searchItem(shortname);
		
		Thread.sleep(3000);
		testContextSetup.landingPageProductNm = landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingPageProductNm + " is the product name");
		
	}
	
	

}
