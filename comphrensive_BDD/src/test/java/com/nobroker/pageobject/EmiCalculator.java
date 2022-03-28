package com.nobroker.pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.EmiCalculatorUi;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class EmiCalculator {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	
	public CaptureScreeshot screenshot;

	public EmiCalculator(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(EmiCalculator.class);	
		exReport=new ExtentReport();
		exReport.createNewTestReport("EmiCalculator");
	}
	public void emiCalci() throws IOException {
		webDriver.clickElement(driver, EmiCalculatorUi.emi);
		webDriver.switchTab(driver, 1);	
		//enter total amount
	}
	public void emipmont(String a,String b,String c) {
		logs.enterInfoLog("enter the total loan ammount 120000");
		exReport.enterPassLog("enter the total loan ammount");
		webDriver.clickElement(driver, EmiCalculatorUi.amount);
		webDriver.clearText(driver, EmiCalculatorUi.amount);
		webDriver.implicitWait(driver, 10);
		webDriver.sendText(driver, EmiCalculatorUi.amount, a);
		webDriver.sendKeys(driver, EmiCalculatorUi.amount, Keys.ENTER);
		logs.enterInfoLog("enter the rate of interset  5%");
		exReport.enterPassLog("enter the rate of interset");
		//enter the interset
		webDriver.clearText(driver, EmiCalculatorUi.rate);
		webDriver.sendText(driver, EmiCalculatorUi.rate, b);
		webDriver.sendKeys(driver, EmiCalculatorUi.rate, Keys.ENTER);
		logs.enterInfoLog("enter the loan tenture 3 years");
		exReport.enterPassLog("enter the loan tenture");
		//enter the year
		webDriver.clearText(driver, EmiCalculatorUi.year);
		webDriver.sendText(driver, EmiCalculatorUi.year, c);
		//click enter
		webDriver.sendKeys(driver, EmiCalculatorUi.year, Keys.ENTER);
		//print the monthly emi	

	}
	public void monthly() throws IOException {
		String memi=webDriver.getText(driver,EmiCalculatorUi.monthlyEmi);
		
		if(memi!=" ") {
			 assertTrue(true);
			logs.enterInfoLog("Monthly emi for your amount is"+memi);
			exReport.enterPassLog("Monthly emi for your amount is"+memi);
			exReport.enterPassLogWithSnap(memi);
			}
			else {
				 assertTrue(false);
				logs.enterErrorLog("entered wrong ammount");
				exReport.enterFailLogWithSnap(memi);
			}
	}
	

}
