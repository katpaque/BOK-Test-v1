package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_URLPage;


public class StepDefs_URLpage {
	
	Page_URLPage newURL = new Page_URLPage();

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
		newURL.launchBrowser();   
	}

	@When("^I open Homepage and I search for pillows")
	public void i_open_URL() throws Throwable {
		newURL.openURL();	    
	}

	
	@Then("^the page title is as expected$")
	
	public void the_page_title_is_as_expected() throws Throwable {
		newURL.checkPageTitle();
	}	
	
	@After

	public void tearDown() throws Exception {
		newURL.tearDown();
	}
}
