package il.co.next.auto_next.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecentlyViewedBlock {
	
	private final static By RECENTLY_VIEWED = By.xpath("//div/div/h3[text()='Recently Viewed']");
	private ActionBot bot;
	private WebDriver m_driver;
	private final static By CLEAR_HISTORY = By.xpath("//div/a[text()='Clear History']");
	private final static By POPUP_ALERT = By.xpath
			("//div/div/p/span[text()='There are no Recently Viewed items to show.']");
	
	public RecentlyViewedBlock(ActionBot bot, WebDriver driver) {
		bot = bot;
		m_driver = driver;
	}
	
	public void verifyRecentlyViewed() {
		bot.waitForElementToBeVisible(RECENTLY_VIEWED);
	}
	
	public void clickOnClearHistory() {
		bot.click(CLEAR_HISTORY);
	}
	
	public void verifyClearHistory() {
		bot.waitForElementToBeVisible(POPUP_ALERT);
	}

}