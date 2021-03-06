package com.nobroker.pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.LoanAggrementUi;
import com.nobroker.uistore.menuBarUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class menuBar {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public menuBar(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(menuBar.class);	
		exReport=new ExtentReport();
		exReport.createNewTestReport("menuBar");
	}
	public void getProperty() throws InterruptedException {
		logs.enterInfoLog("click on the menu icon");
		exReport.enterPassLog("click on the menu icon");
		webDriver.clickElement(driver,menuBarUi.menu);
		Thread.sleep(1000);
		logs.enterInfoLog("select the post your property");
		exReport.enterPassLog("select the post your property");
		webDriver.clickElement(driver,menuBarUi.pproperty);
		
		if(webDriver.elementPresent(driver, menuBarUi.X)) {
			webDriver.clickElement(driver, menuBarUi.X);
		}
			
	}
	public void postProperty() throws IOException {
		String title=webDriver.getText(driver,menuBarUi.nobroker);
		if(title!=" ") {
			assertTrue(true);
			logs.enterInfoLog("the title is present in the page");
			logs.enterInfoLog("title is"+title);
			exReport.enterPassLogWithSnap("the title is present in the page"+title);
		}
		else {
			assertTrue(false);
			logs.enterInfoLog("the title is  not present in the page");
			exReport.enterFailLogWithSnap("no title");
			
		}
	}
}
