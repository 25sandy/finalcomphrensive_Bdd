
Feature: Emi calculator
Scenario: click on emi calculator in footer and calculate emi
Given initialize the "Chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on Emi calculator in footer which will open in next tab
And enter the amount "1200000" interset "33"  year "3" and calculate emi
And exit the browser