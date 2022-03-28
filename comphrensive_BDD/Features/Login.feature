
Feature: Login

Scenario: Login with vaild credentials 
	Given initialize the "Chrome" browser
      Then navigate to "https://www.nobroker.in/" website
	Then entering phone number "8508577013" and passord as "san661"
	And click on sigin in
	Then it must login into account
	And exit the browser