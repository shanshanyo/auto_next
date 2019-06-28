package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homeware extends AbstractPage {
	private final static By HOMEWARE = By.xpath("//div/h1[text()='Homeware']");
	private final static By KITCHEN = By.xpath("//div/h2/a[text()='Kitchen']");

	public Homeware(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	@Override
	public void assertInWebPage() {
		verifyHomeware();
	}
	
	public HomewareKitchen clickOnKitchen() {
		bot.waitForElementToBeVisible(KITCHEN);
		bot.scrollDown("600");
		bot.click(KITCHEN);
		return new HomewareKitchen(driver);
	}
	private void verifyHomeware() {
		bot.waitForElementToBeVisible(HOMEWARE);
	}
}