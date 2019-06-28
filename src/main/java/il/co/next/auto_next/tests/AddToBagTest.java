package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.ChosenItemPage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.Homeware;
import il.co.next.auto_next.pages.HomewareKitchen;
import il.co.next.auto_next.web.BottomToolBar;

//this test checks the 'add to bag' action is properly executed

public class AddToBagTest extends AbstractTest{
	@Test
	public void _004_addToBagTest() throws Exception {

		HomePage homePage = loginToNext();
		Homeware hw = homePage.getMainNavigationBar().clickOnHome();
		int itemsInBag = hw.getMainNavigationBar().numOfItemsInBag();
		HomewareKitchen hk = hw.clickOnKitchen();
		ChosenItemPage cip = hk.clickOnChosenItem();
		cip.clickOnAddToBag();
		int newItemsInBag = hw.getMainNavigationBar().numOfItemsInBag();
		assert(itemsInBag + 1 == newItemsInBag);
		
		 
		
	}
}