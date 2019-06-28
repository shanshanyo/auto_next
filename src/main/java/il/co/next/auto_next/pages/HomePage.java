package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import il.co.next.auto_next.web.MainNavigationBar;
import il.co.next.auto_next.web.RecentlyViewedBlock;

public class HomePage extends AbstractPage {
	private static final By ADIDAS_LOGO = By.xpath("//div/a/div/img[@alt='Adidas-black']");
	
	public HomePage(WebDriver driver) {
		super(driver);
		assertInWebPage();
	}
	@Override
	public void assertInWebPage() {
		getMainNavigationBar().waitForNextLogo();
	}
	
	public LoginPage clickOnMyAccount() {
		MainNavigationBar mnb = getMainNavigationBar();
		LoginPage nma = mnb.ClickOnMyAccount();
		return nma;
		
		}
	public void scrollToAdidasLogo() {
		bot.scrollDown("800");
	}
	
	public void scrollToRecentlyViewed() {
		bot.scrollDown("700");
		
	}
	
	public RecentlyViewedBlock getRecentlyViewedBlock() {
		return new RecentlyViewedBlock(bot, driver);
	}
	
	
	public AdidasPage clickOnAdidasLogo() {
		bot.click(ADIDAS_LOGO);
		return new AdidasPage(driver);
	}
	
}