package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountMenu extends AbstractPage {
	private final static By ACCOUNT_MENU = By.xpath("//div/h2[text()='My Account']");
	
	public AccountMenu(WebDriver driver) {
		super(driver);
		assertInWebPage();

	}
	
	@Override
	public void assertInWebPage() {
		bot.waitForElementToBeVisible(ACCOUNT_MENU);
	}
}