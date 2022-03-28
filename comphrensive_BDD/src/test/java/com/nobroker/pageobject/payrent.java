package com.nobroker.pageobject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class payrent {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public payrent(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) throws IOException {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(payrent.class);	
		exReport=new ExtentReport();
		exReport.createNewTestReport("pay rent");
	}
	public void printrent() {
		webDriver.clickElement(driver, HomepageUi.payrent);
		logs.enterInfoLog("print the payable option");
		exReport.enterPassLog("print on the payable option");
		
	}
	public void check() throws IOException {
		webDriver.switchTab(driver, 1);	
		//String data=" ";
		String data=webDriver.getText(driver, HomepageUi.data);
        if(data!=" ") {
        	 assertTrue(true);
        	logs.enterInfoLog("payable option"+data);
        	exReport.enterPassLog(data);
        	
        }
        else {
        	 assertTrue(false);
        	 exReport.enterFailLogWithSnap("error");
        }
	}
}
