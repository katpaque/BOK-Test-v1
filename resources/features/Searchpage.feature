@REQ_CD-3
Feature: Validate Search
	
	@TEST_CD-40
	Scenario: Cucumber: Test Search
		Given I launch Chrome browser for bank
		When I open Homepage and I search for bank
		Then the page Search title is as expected
