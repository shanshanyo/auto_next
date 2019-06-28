package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingBag extends AbstractPage {
	
	private final static By REMOVE_ITEM = By.xpath("//div/a[text()='Remove Item']");
	
	public ShoppingBag(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	
	@Override
	public void assertInWebPage() {
		verifyRemoveItemIcon();
	}

	public void clickOnRemoveItem() {
		bot.click(REMOVE_ITEM);
										
	}
	
	private void verifyRemoveItemIcon() {
		bot.waitForElementToBeVisible(REMOVE_ITEM);
		
	}
}
