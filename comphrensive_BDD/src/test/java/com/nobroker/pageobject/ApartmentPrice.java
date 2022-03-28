package com.nobroker.pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class ApartmentPrice {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public ApartmentPrice(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(ApartmentPrice.class);	
		exReport=new ExtentReport();
		exReport.createNewTestReport("Apartment price");
	}
	public void getprice() throws InterruptedException {
		logs.enterInfoLog("click on newapartment option" );
		exReport.enterPassLog("click on new apartment option");
		
		webDriver.clickElement(driver, HomepageUi.bhk1);
		Thread.sleep(1000);
		 webDriver.switchTab(driver, 1);
		 logs.enterInfoLog("select the apartment option 1 BHK ");
		 exReport.enterPassLog("select the apartment option 1BHK");
		webDriver.clickElement(driver, HomepageUi.invidual);
		//System.out.println("--------");
		Thread.sleep(1000);	
	}
	public void printprice() throws IOException {
		String price=webDriver.getText(driver,HomepageUi.aprice);
		if(price!=" ") {
			assertTrue(true);
			logs.enterInfoLog("the apartment price is"+price);
			exReport.enterPassLogWithSnap(price);
		}
		else {
			assertTrue(false);
			exReport.enterFailLogWithSnap(price);
		}
	}
}
