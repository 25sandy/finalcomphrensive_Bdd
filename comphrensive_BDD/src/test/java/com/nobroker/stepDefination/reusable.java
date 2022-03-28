package com.nobroker.stepDefination;

import java.io.IOException;

import com.nobroker.utility.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class reusable extends BaseClass{

	@Given("initialize the {string} browser")
	
	public void initialize_the_browser(String browser) throws IOException {
	    required();
	    driverSetUp(browser);
	}
	
	@Then("navigate to {string} website")
	public void navigate_to_website(String Url) throws IOException {
		logs.createLogger(getClass());
		exReport.createNewTestReport("Open NoBroker");
		logs.enterInfoLog("Open NoBroker");
		exReport.enterInfoLog("Opening NoBroker.in");
		webDriver.openPage(driver, Url);
		if (webDriver.getCurrentUrl(driver).equals(Url)) {
			exReport.enterPassLogWithSnap("NoBroker as opened");
			logs.enterInfoLog("NoBroker as opened");
		} else {
			exReport.enterFailLogWithSnap("NoBroker as opened");
		}
	}
	
	
	
	@And("exit the browser")
	public void exit_the_browser() throws IOException {
	    driverExit();
	    exReport.flush();
	}
}
