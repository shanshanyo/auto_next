package il.co.next.auto_next.tests;

import org.testng.annotations.Test;


import il.co.next.auto_next.pages.ChosenItemPage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.Homeware;
import il.co.next.auto_next.pages.HomewareKitchen;

public class AddToFavouritesTest extends AbstractTest {
	
//this test checks that the 'add to favourites' action is properly executed	
	
	@Test
	public void _005_addToFavouritesTest() throws Exception {

		HomePage homePage = loginToNext();
		Homeware hw = homePage.getMainNavigationBar().clickOnHome();
		HomewareKitchen hk = hw.clickOnKitchen();
		ChosenItemPage cip = hk.clickOnChosenItem();
		cip.clickOnHeartOnlyIfNotClicked();
		assert(cip.getMainNavigationBar().isHeartOn());
	 
			 
		
	}

}

