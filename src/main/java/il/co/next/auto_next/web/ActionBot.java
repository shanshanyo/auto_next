package il.co.next.auto_next.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

public class ActionBot {

	private ReportDispatcher report = ReportManager.getInstance();
	private WebDriver driver;
	private WebDriverWait webDriverWait;
	
	public ActionBot(WebDriver driver) {
		this.driver = driver;
		webDriverWait = new WebDriverWait(driver, 15);
	}
	
	public void scrollDown(String val) {
		String script = "window.scrollBy(0," + val + ")";
		((JavascriptExecutor)driver).executeScript(script);
	}
	

	
	
	public void waitForElementToBeVisible(By locator) {
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	
	
	
	public String getTextFromLocator(By locator) {
		return driver.findElement(locator).getText();
		
	}
	
	public String getValueFromAttribute(By locator, String attribute) {
		return driver.findElement(locator).getAttribute(attribute);
		
	}
	
	
	public void waitForElementToBeClickable(By locator) {
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void sendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
	
}
	