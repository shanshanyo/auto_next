package il.co.next.auto_next.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import il.co.next.auto_next.pages.CustomerServicePage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.Homeware;
import il.co.next.auto_next.pages.LoginPage;

public class MainNavigationBar {
	
	
	// Members class
	private ActionBot bot;
	private By m_myAccount = By.linkText("My Account");
	private WebDriver m_driver;
	private final static By NEXT_LOGO = By.id("header-logo");
	private final static By HOME = By.xpath("//li/a/span[text()='Home']");
	private final static By NUM_OF_ITEMS = By.xpath("//div/div[@class='ItemCount']/span");
	private final static By HELP_BUTTON = By.xpath("//li/a[text()='Help']");
	private final static String HEART_IS_ON = "notification";
	private final static By HEART = By.xpath("(//section/a/div)[4]");
	
	
	// Constructor
	public MainNavigationBar(ActionBot bot, WebDriver driver) {
		this.bot = bot;
		m_driver = driver;
	
	}
	
	// Public methods
	public LoginPage ClickOnMyAccount() {
		bot.click(m_myAccount);
		return new LoginPage(m_driver);
	}
	
	
	public void waitForNextLogo() {
		bot.waitForElementToBeClickable(NEXT_LOGO);
	}
	
	public HomePage clickOnNextLogo() {
		bot.click(NEXT_LOGO);
		return new HomePage(m_driver);
	}
	
	public Homeware clickOnHome() {
		bot.click(HOME);
		return new Homeware(m_driver);
	}
	
	public int numOfItemsInBag() throws InterruptedException {
		bot.waitForElementToBeVisible(NUM_OF_ITEMS);
		Thread.sleep(5000);
		return Integer.parseInt(bot.getTextFromLocator(NUM_OF_ITEMS));
	}
	
	public CustomerServicePage clickOnHelpButton() {
		bot.click(HELP_BUTTON);
		return new CustomerServicePage(m_driver);
	}
	
	public boolean isHeartOn() {
		String value = bot.getValueFromAttribute(HEART, "class");
		if(value.contains(HEART_IS_ON)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
		
}
