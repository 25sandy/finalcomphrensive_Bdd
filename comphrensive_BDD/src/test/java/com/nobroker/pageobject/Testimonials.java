package com.nobroker.pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class Testimonials {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public Testimonials(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(Testimonials.class);	
		exReport=new ExtentReport();
		exReport.createNewTestReport("Testimonials");
	}
	public void getdetails() throws InterruptedException {
		logs.enterInfoLog("click on the testimonials option");
		exReport.enterPassLog("click on the testimonial option");
		webDriver.clickElement(driver,HomepageUi.test);
		  webDriver.switchTab(driver, 1);	
		 //webDriver.switchTab(driver, 1);	
		
	}
	public void testimonial() throws IOException {
		String para=webDriver.getText(driver, HomepageUi.rating);
		System.out.println(para);
		if(para!=" ") {
		 assertTrue(true);
		 logs.enterInfoLog("the testimonial is printed"+para);
		 exReport.enterPassLogWithSnap(para);
		
		}
		else {
			assertTrue(false);
			logs.enterInfoLog("cant find the location");
			exReport.enterFailLogWithSnap(para);
		}
	}
}
