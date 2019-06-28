package il.co.next.auto_next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import il.co.next.auto_next.web.ActionBot;
import il.co.next.auto_next.web.MainNavigationBar;
import il.co.next.auto_next.web.BottomToolBar;
import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

public abstract class AbstractPage {
	protected ReportDispatcher report = ReportManager.getInstance();
	protected WebDriver driver;
	protected ActionBot bot;
	private MainNavigationBar m_mnb;
	private BottomToolBar m_nbtb;
	private CustomerServicePage m_ncsp;

		
	public abstract void assertInWebPage();

	public  AbstractPage(WebDriver driver) {
		this.driver = driver;
		bot = new ActionBot(driver);
		m_mnb = new MainNavigationBar(bot, driver);
		m_nbtb = new BottomToolBar(bot, driver);
		
		
		
		//assertInWebPage();
	}
	
	public MainNavigationBar getMainNavigationBar() {
		return m_mnb;
	}
	public BottomToolBar getBottomToolBar() {
		return m_nbtb;
	}
	
	public CustomerServicePage getNextCustomerServicePage() {
		return m_ncsp;
	}
}