package il.co.next.auto_next.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerServicePage extends AbstractPage {
	public CustomerServicePage ncsp;
	private final static By HELP_SEARCHBAR = By.id("ctl00_SearchControl1_txtSearch");
	private ArrayList<String> m_tabs = new ArrayList<String> (driver.getWindowHandles());
	
	
	
	public CustomerServicePage (WebDriver driver) {
		super(driver);
		
	}

	@Override
	public void assertInWebPage() {
		verifyCustomerServicePage();
	}
	
	//switches to new tab - customer service
	public void openCustomerServiceTab() {  
		driver.switchTo().window(m_tabs.get(1));
		driver.get("https://www.nextdirect.com/help/en/il/");
	}
	
	
	public void verifyCustomerServicePage() {
		bot.waitForElementToBeVisible(HELP_SEARCHBAR);
	  
		
	}
	
	// switch back to next home page 
	public void backToHomePageTab() {
		 driver.switchTo().window(m_tabs.get(0));
		 driver.get("https://www.next.co.il/en");
	}
	
	
}
