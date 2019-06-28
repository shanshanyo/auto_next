package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdidasPage extends AbstractPage {
	
	private static final By ADIDAS_TITLE = By.xpath("//div/h1/span[text()='Adidas']");
	
	public AdidasPage (WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	
	@Override
	public void assertInWebPage() {
		verifyAdidasPage();
	}
	
	
	public void verifyAdidasPage() {
		bot.waitForElementToBeVisible(ADIDAS_TITLE);
		
	}
	
	

}