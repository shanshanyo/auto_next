package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemsInBag extends AbstractPage {
	
	private final static By VIEW_OR_EDIT_BAG = By.xpath("//div/a[text()='VIEW/EDIT BAG']");
	
	
	public ItemsInBag(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	
	@Override
	public void assertInWebPage() {
		verifyViewBagButton();
	}
	
	public ShoppingBag clickViewOrEditBag() {
		bot.click(VIEW_OR_EDIT_BAG);
		return new ShoppingBag(driver);
										
	}
	
	private void verifyViewBagButton() {
		bot.waitForElementToBeClickable(VIEW_OR_EDIT_BAG);
	}
}
