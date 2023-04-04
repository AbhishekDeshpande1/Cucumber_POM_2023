package com.test.practise.utilities;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.practise.testbase.DriverFactory;
import com.test.practise.utilities.Utility.ELEMENT_LOCATE_BY;

/**
 * This class consist of all Generic Action Methods used to perform actions on the Web Page
 * 
 *
 */
public class ActionMethods extends DriverFactory{
	public void waitForCertainPeriod(long milliSec) {
		try {
			Thread.sleep(milliSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public WebElement findElement(String locator, ELEMENT_LOCATE_BY ele) {
		WebElement element;
		switch (ele) {
		case XPATH:
			element = driver.findElement(By.xpath(locator));
			highlight(element);
			return element;

		case ID:
			element = driver.findElement(By.id(locator));
			highlight(element);
			return element;

		case NAME:
			element = driver.findElement(By.name(locator));
			highlight(element);
			return element;

		case CLASSNAME:
			element = driver.findElement(By.className(locator));
			highlight(element);
			return element;
			
		case CSSSELECTOR:	
			element = driver.findElement(By.cssSelector(locator));
			highlight(element);
			return element;
			
			default:
			return null;
		}
	}

	public void clickElement(String locator, ELEMENT_LOCATE_BY ele) {
		findElement(locator, ele).click();
		waitForCertainPeriod(2000);
	}

	public void waitForElementPresent(String locator, ELEMENT_LOCATE_BY ele, int waitTime) {
		//WebDriverWait wait = new WebDriverWait(driver, waitTime);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));
				
		switch (ele) {
		case XPATH:
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
			break;

		case ID:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
			break;

		case NAME:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
			break;

		case CLASSNAME:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
			break;
		
		case CSSSELECTOR:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
			break;
			
		}

	}

//	public void waitForPageLoad() {
//		(new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
//			public Boolean apply(WebDriver driver) {
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				String readyState = js.executeScript("return document.readyState").toString();
//				return (Boolean) readyState.equals("complete");
//			}
//		});
//	}
//
	public WebElement waitForClickabilityOfElement(String locator, int timeOutPeriod) {
		WebDriverWait  webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(timeOutPeriod));
		//WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		return webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}

	public void inputValue(String locator, String value, ELEMENT_LOCATE_BY ele) {
		findElement(locator, ele).clear();
		findElement(locator, ele).sendKeys(value);
		waitForCertainPeriod(1000);
	}

	public void switchToFrameById(String frameId) {
		driver.switchTo().frame(frameId);
	}

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchFrameToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public void selectElementUsingVisibleText(String locator, ELEMENT_LOCATE_BY element,String text) {
		WebElement webElement = findElement(locator, element);
		Select select = new Select(webElement);
		waitForCertainPeriod(2000);
		select.selectByVisibleText(text);
		waitForCertainPeriod(2000);
			}
	public void selectElementUsingValue(String locator, ELEMENT_LOCATE_BY element,String text) {
		WebElement webElement = findElement(locator, element);
		Select select = new Select(webElement);
		select.selectByValue(text);
}
	
	
	public String getCurrentUrl() {
		waitForCertainPeriod(5000);
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public String getTitleOfPage() {
		waitForCertainPeriod(5000);
		String title = driver.getTitle();
		return title;
	}

	public void highlight(WebElement element) {
		try {
			if (true) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
						"border: 2px solid red;");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementUsingJS(String locator, ELEMENT_LOCATE_BY element) {
		WebElement webElement = findElement(locator, element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", webElement);
		waitForCertainPeriod(3000);
	}
	public static String getScreenshot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//Screenshot//" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
	
}
