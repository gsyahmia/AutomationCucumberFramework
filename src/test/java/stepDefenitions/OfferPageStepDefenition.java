package stepDefenitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefenition {
	
	public String offerPageProdNm;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	OfferPage offerPage;

	
	public OfferPageStepDefenition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.offerPage = testContextSetup.pageObjectManager.getOfferPage();
	}
	
	
	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_shortname_in_offers_page(String shortname) throws InterruptedException {
		switchToOffersPage();
		
		offerPage.searchItem(shortname);
		offerPageProdNm = offerPage.getProductName();
		System.out.println(offerPageProdNm + " product name in offer page");
	}
	
	public void switchToOffersPage() throws InterruptedException {
		if(!offerPage.urlCheck()) {//Make sure to be not in Offerpage before switch tab
			
			LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
			landingPage.linkTopDealClick();
			Thread.sleep(3000);
			
			testContextSetup.genericUtils.SwitchWindowToChild();
		}
		
	}
	
	@Then("validate the product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(testContextSetup.landingPageProductNm, offerPageProdNm);
	}
	
}
