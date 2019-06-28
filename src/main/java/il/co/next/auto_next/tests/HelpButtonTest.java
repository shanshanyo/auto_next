package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.CustomerServicePage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.Homeware;

public class HelpButtonTest extends AbstractTest {
	
//this test transfers to a new tab of customer service 	

	@Test
	public void _003_helpButtonTest() {
		HomePage homePage = loginToNext();
		CustomerServicePage csp = homePage.getMainNavigationBar().clickOnHelpButton();
		csp.openCustomerServiceTab();
		csp.verifyCustomerServicePage();
		csp.backToHomePageTab();
		
		
	}

}