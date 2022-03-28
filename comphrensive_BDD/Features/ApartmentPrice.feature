Feature: Apartment_Price
Scenario: checking the apartment price in given location
Given initialize the "Chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on new apartment option select the 1BHK 
And  Apartment price should be displayed
And exit the browser