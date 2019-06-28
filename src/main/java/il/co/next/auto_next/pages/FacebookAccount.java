package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookAccount extends AbstractPage {
	private By m_loginButton = By.id("u_0_3");
	
	public FacebookAccount(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	@Override
	public void assertInWebPage() {
		verifyFacebookAccount();
	}
	private void verifyFacebookAccount() {
		bot.waitForElementToBeClickable(m_loginButton);
	}
	
}