package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Search_URL_Page;


public class StepDefs_Searchpage {
	
	Search_URL_Page newURL = new Search_URL_Page();
	
	@Given("^I launch Chrome browser for bank$")
	public void i_launch_Chrome_browser_for_bank() throws Throwable {
		newURL.launchBrowser();   
	}

	@When("^I open Homepage and I search for bank$")
	public void i_open_Homepage_and_I_search_for_bank() throws Throwable {
		newURL.openURL();
	}

	@Then("^the page Search title is as expected$")
	public void the_page_Search_title_is_as_expected() throws Throwable {
		newURL.checkPageTitle();
	}

	
	@After

	public void tearDown() throws Exception {
		newURL.tearDown();
	}
}
