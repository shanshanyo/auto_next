package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.ChosenItemPage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.Homeware;
import il.co.next.auto_next.pages.HomewareKitchen;
import il.co.next.auto_next.web.RecentlyViewedBlock;

public class ClearHistoryTest extends AbstractTest {

//this test clears the history of the recently viewed items 
	
	@Test
	public void _009_clearHistoryTest() throws Exception {

		HomePage hp = loginToNext();
		Homeware hw = hp.getMainNavigationBar().clickOnHome();
		HomewareKitchen hk = hw.clickOnKitchen();
		ChosenItemPage cip = hk.clickOnChosenItem();
		hp = cip.getMainNavigationBar().clickOnNextLogo(); 
		hp.scrollToRecentlyViewed();
		RecentlyViewedBlock rvb = hp.getRecentlyViewedBlock();
		rvb.verifyRecentlyViewed();
		rvb.clickOnClearHistory();
		rvb.verifyClearHistory();
		
		 
		
	}

}