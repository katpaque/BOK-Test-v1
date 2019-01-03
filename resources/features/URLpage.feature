@REQ_CD-1
Feature: Un-publish HELOAN 192,204,216,228 month terms (UAT)
	#As a client viewing the Loan Rates Marketing Page, I do not want to see the terms for 192 months, 204 months, 216 months and 228 months. 
	
	#Tests As a client viewing the Loan Rates Marketing Page, I do not want to see the terms for 192 months, 204 months, 216 months and 228 months. 

	@TEST_CD-4
	Scenario: Cucumber: Test URL
		Given I launch Chrome browser
		When I open Homepage and I search for pillows
		Then the page title is as expected
