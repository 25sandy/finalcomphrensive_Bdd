Feature: hotelAddress
Scenario: checking the available hotels by passsing the places
Given initialize the "Chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on search and enter place "gateway"
And  click on enter and check the address is present or not
And exit the browser