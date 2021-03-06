package com.nobroker.reusable;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverHelper {

	public void clickElement(WebDriver driver, By element) throws ElementNotInteractableException {
		driver.findElement(element).click();
	}

	public void clearText(WebDriver driver, By element) throws ElementNotInteractableException {
		driver.findElement(element).clear();
	}

	public void sendText(WebDriver driver, By element, String value) throws ElementNotInteractableException {
		driver.findElement(element).sendKeys(value);
	}

	public void sendText(WebDriver driver, By element, String value, Keys key) {
		driver.findElement(element).sendKeys(value, key);
	}
	public void sendKeys(WebDriver driver,By element,Keys key) {
		driver.findElement(element).sendKeys(key);
	}

	public String getText(WebDriver driver, By element) {
		return driver.findElement(element).getText();
	}

	public void switchTab(WebDriver driver, int index) {
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(index));
	}

	public void implicitWait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public void openPage(WebDriver driver, String Url) {
		driver.get(Url);
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void hover(WebDriver driver, By automotive, By carLights) throws InterruptedException {
		WebElement element = driver.findElement(automotive);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1);
		driver.findElement(carLights).click();
	}
	public void setSize(WebDriver driver, int width, int height) {
		Dimension dimensions = new Dimension(width, height);
		driver.manage().window().setSize(dimensions);
	}
	public boolean elementPresent(WebDriver driver, By element) {
		System.out.println(driver.findElements(element).size());
		if(driver.findElements(element).isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
}
