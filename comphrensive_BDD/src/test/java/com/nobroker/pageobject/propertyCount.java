package com.nobroker.pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.propertyCountUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class propertyCount {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public propertyCount(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(Login.class);
		exReport=new ExtentReport();
		exReport.createNewTestReport("property count");
		
	}
	public void countingofplots(String place) throws InterruptedException {
		webDriver.clickElement(driver, propertyCountUi.commerial);
		webDriver.implicitWait(driver, 1000);
		Thread.sleep(1000);
		logs.enterInfoLog("select the city to check the availability");
		exReport.enterPassLog("select the city to check the availability");
		webDriver.clickElement(driver, propertyCountUi.city);
		webDriver.implicitWait(driver, 1000);
		webDriver.clickElement(driver, propertyCountUi.bangalore);
		Thread.sleep(2000);
		webDriver.clickElement(driver,propertyCountUi.search);
		logs.enterInfoLog("enter the place you want to search");
		exReport.enterPassLog("enter the place want to search");
		webDriver.sendText(driver,propertyCountUi.search, place);
		webDriver.implicitWait(driver, 1000);
		Thread.sleep(2000);
		webDriver.sendKeys(driver, propertyCountUi.search, Keys.ARROW_DOWN);
		webDriver.sendKeys(driver, propertyCountUi.search, Keys.ENTER);
		Thread.sleep(2000);
		webDriver.clickElement(driver, propertyCountUi.button);
		Thread.sleep(2000);}
	 public void checkcount() throws IOException {
		logs.enterInfoLog("mark the checkbox office and coworking");
		exReport.enterPassLog("mark the checkbox named office and coworkers");
		webDriver.clickElement(driver, propertyCountUi.office);
		webDriver.clickElement(driver, propertyCountUi.coworking);
		String count=webDriver.getText(driver, propertyCountUi.count);
		//String count=" ";
	     if(count!=" ") {
	    	 assertTrue(true);
	    	 logs.enterInfoLog("the available property is"+count);
	    	 exReport.enterPassLogWithSnap(count);
	     }
	     else
	     {
	    	 assertTrue(false);
	    	 logs.enterInfoLog("no plots available");
	    	 exReport.enterFailLogWithSnap("no plots is available");
	     }
		
		
	}
	
}
