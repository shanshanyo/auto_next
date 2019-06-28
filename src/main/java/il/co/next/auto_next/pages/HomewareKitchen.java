package il.co.next.auto_next.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomewareKitchen extends AbstractPage {
	
	private final static By HOMEWARE_KITCHEN = By.xpath("//div/h1/span[text()='Homeware kitchen']");
	private final static By CHOSEN_ITEM = By.xpath("//div/h2/a[@data-desc='Set of 4 Optic Rib Wine Glasses']");
	
	public HomewareKitchen(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	public ChosenItemPage clickOnChosenItem() {
		//bot.waitForElementToBeVisible(CHOSEN_ITEM);
		bot.scrollDown("400");
		bot.waitForElementToBeClickable(CHOSEN_ITEM);
		bot.click(CHOSEN_ITEM);
		return new ChosenItemPage(driver);
	}
	
	@Override
	public void assertInWebPage() {
		verifyHomewarekitchen();
	}
	private void verifyHomewarekitchen() {
		bot.waitForElementToBeVisible(HOMEWARE_KITCHEN);
	}
	
}