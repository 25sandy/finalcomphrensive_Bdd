Feature: Property count
Scenario: counting the available property in particular location
Given initialize the "Chrome" browser
Then navigate to "https://www.nobroker.in/" website
And select the city Bangalore and search place "electronic city"
And   mark checkbox office and coworkers and verify the count
And exit the browser