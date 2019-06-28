package il.co.next.auto_next.web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import il.co.next.auto_next.pages.FacebookAccount;
import il.co.next.auto_next.pages.InstagramAccount;
import il.co.next.auto_next.pages.LoginPage;

public class BottomToolBar {
	private ActionBot bot;
	private WebDriver m_driver;
	
	private By m_facebook = By.xpath("//ul/li/a/img[@alt='Facebook']");
	private By m_instagram = By.xpath("//ul/li/a/img[@alt='Instagram']");
	
		
	public BottomToolBar(ActionBot bot, WebDriver driver) {
		bot = bot;
		m_driver = driver;
	}
	
	public FacebookAccount ClickOnFacebookIcon() {
		bot.waitForElementToBeClickable(m_facebook);
		bot.click(m_facebook);
		return new FacebookAccount(m_driver);
	}
	
	public InstagramAccount ClickOnInstagramIcon() {
		bot.waitForElementToBeClickable(m_instagram);
		bot.click(m_instagram);
		return new InstagramAccount(m_driver);
	}
}

