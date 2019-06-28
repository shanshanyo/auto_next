package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChosenItemPage extends AbstractPage {
	private final static By ADD_TO_BAG = By.xpath
			("//div/div/a[@onclick='ProductPage.Styles.AddToBagCTA.AddItem(this); return false;']");
	
	private final static By HEART_ICON = By.xpath("//div/div/a[text()='Add to Favourites']");
	private final static String HEART_IS_ON = "add";
	
	public ChosenItemPage(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	
	public ItemsInBag clickOnAddToBag() {
		bot.click(ADD_TO_BAG);
		return new ItemsInBag(driver);
	}	
		
	@Override
	public void assertInWebPage() {
		verifyAddToBagButton();
	}
	private void verifyAddToBagButton() {
		bot.waitForElementToBeVisible(ADD_TO_BAG);
	}
	
	//this method adds to favourites
	public void clickOnHeartIcon() {
		bot.waitForElementToBeVisible(HEART_ICON);
		bot.click(HEART_ICON);
										
	}
	//this method checks if the heart icon is black or white
	public boolean isHeartOn() {
		String value = bot.getValueFromAttribute(HEART_ICON, "class");
		if(value.contains(HEART_IS_ON)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickOnHeartOnlyIfNotClicked() {
		if(isHeartOn()==true) {
			clickOnHeartIcon();
		}
	}
}