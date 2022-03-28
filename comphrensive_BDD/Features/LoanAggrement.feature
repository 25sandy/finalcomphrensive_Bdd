
Feature: Loan Aggrement

Scenario: checking loan aggrement page title
	Given initialize the "Chrome" browser
      Then navigate to "https://www.nobroker.in/" website
	Then  click on Loan Aggrement
	Then check the title with this input "Online Rent Agreement, Lease Agreement"
	And exit the browser