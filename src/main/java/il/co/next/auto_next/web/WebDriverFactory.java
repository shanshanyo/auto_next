package il.co.next.auto_next.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import il.co.next.auto_next.config.MainConfig;
import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

public class WebDriverFactory {

	private static ReportDispatcher report = ReportManager.getInstance();
	
	public static WebDriver getWebDriver(WebDriverType webDriverType) {
		
		WebDriver driver = null;
		
		switch(webDriverType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shany\\eclipse-workspace\\next\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.next.co.il");
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shany\\eclipse-workspace\\next\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case INTERNET_EXPLORER:
			System.setProperty("webdriver.ie.driver", "C:\\Users\\shany\\eclipse-workspace\\next\\webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(MainConfig.webDriverImplicitWaitInSeconds, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		report.log("Opened new " + webDriverType + " browser window");
		
		return driver;
	}
}