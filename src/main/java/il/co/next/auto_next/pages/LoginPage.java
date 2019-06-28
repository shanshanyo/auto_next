package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{
	private By m_email = By.id("EmailOrAccountNumber");
	private By m_password = By.id("Password");
	private By m_signInNow = By.id("SignInNow");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	
	@Override
	public void assertInWebPage() {
		bot.waitForElementToBeVisible(m_email);
	}
	public void sendUserName(String value) {
		bot.sendKeys(m_email, value);
	}
	public void sendPassword(String value) {
		bot.sendKeys(m_password, value);
	}
	public AccountMenu clickSignInNow() {
		bot.click(m_signInNow);
		return new AccountMenu(driver);
	}
}
