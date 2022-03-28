package com.nobroker.pageobject;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.LoanAggrementUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;
public class LoanAggrement  {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public LoanAggrement(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(LoanAggrement.class);
		exReport=new ExtentReport();
		exReport.createNewTestReport("LoanAggrement");
		
	}
	
	public void  selectLA() {
		webDriver.clickElement(driver,LoanAggrementUi.la);	
		logs.enterInfoLog("the loan aggrement page is opened");
		exReport.enterPassLog("the loan aggrement page has opened");
	}
	public  void verifyTitle(String e) throws IOException {
	   webDriver.switchTab(driver, 1);	
		//System.out.println(webDriver.elementPresent(driver, LoanAggrementUi.X));
		//System.out.println(webDriver.getCurrentUrl(driver));
		if(webDriver.elementPresent(driver, LoanAggrementUi.X)) {
			webDriver.clickElement(driver, LoanAggrementUi.X);
		}
		
		if(webDriver.getText(driver, LoanAggrementUi.title).equalsIgnoreCase(e)) {
			assertTrue(true);
			logs.enterInfoLog("the  page title matches with given input");
			exReport.enterPassLogWithSnap(e);
		}
		else {
			assertTrue(false);
			logs.enterInfoLog("the title didnt matches with given input");
			exReport.enterFailLogWithSnap(e);}
	}

	
	
}
