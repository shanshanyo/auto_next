package il.co.next.auto_next.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import il.co.next.auto_next.config.MainConfig;
import il.co.next.auto_next.pages.AccountMenu;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.LoginPage;
import il.co.next.auto_next.web.WebDriverFactory;
import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import il.co.topq.difido.model.Enums.Status;

@Listeners(il.co.topq.difido.ReportManagerHook.class)
public abstract class AbstractTest {

	protected static ReportDispatcher report = ReportManager.getInstance();
	protected static WebDriver driver;
	private final static String USERNAME = "finalproject549196@gmail.com";
	private final static String PASSWORD = "1346abcd";
	private final static String URL = "http://www.next.co.il/en";
	


	@BeforeMethod
	public void beforeTest() throws IOException {

		MainConfig.initFromFile("src/main/resources/config/MainConfig.properties");
		if (driver == null) {
			driver = WebDriverFactory.getWebDriver(MainConfig.webDriverType);
		}
	}

	public HomePage browseToUrl(String url) {
		report.log("Browsing to URL: " + url);
		driver.get(url);
		driver.manage().window().maximize();
		return new HomePage(driver);
	}

	public HomePage loginToNext() {
		HomePage homePage = browseToUrl(URL);	
		LoginPage loginPage = homePage.clickOnMyAccount();
		loginPage.sendUserName(USERNAME);
		loginPage.sendPassword(PASSWORD);
		AccountMenu am = loginPage.clickSignInNow();
		homePage = am.getMainNavigationBar().clickOnNextLogo();
		
		return homePage;
	}

	@AfterMethod
	public void afterTest() throws Exception {
		driver.close(); 
		driver.quit();

	

		
	}
}
