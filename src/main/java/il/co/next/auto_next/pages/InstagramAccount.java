package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramAccount extends AbstractPage {
	private By m_loginButton = By.xpath("//span/a/button[text()='Log In']");
	public InstagramAccount(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	@Override
	public void assertInWebPage() {
		verifyInstagramAccount();
	}
	private void verifyInstagramAccount() {
		bot.waitForElementToBeClickable(m_loginButton);
	}
}