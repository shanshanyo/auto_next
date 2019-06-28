package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.ChosenItemPage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.Homeware;
import il.co.next.auto_next.pages.HomewareKitchen;
import il.co.next.auto_next.pages.ItemsInBag;
import il.co.next.auto_next.pages.ShoppingBag;

public class ViewOrEditBagTest extends AbstractTest {

//this test validates the 'view or edit bag' button after adding an item to bag	
	
	@Test
	public void _010_viewOrEditBagTest() throws Exception {
		HomePage homePage = loginToNext();
		Homeware hw = homePage.getMainNavigationBar().clickOnHome();
		HomewareKitchen hk = hw.clickOnKitchen();
		ChosenItemPage cip = hk.clickOnChosenItem();
		ItemsInBag iib = cip.clickOnAddToBag();
		ShoppingBag sp = iib.clickViewOrEditBag();
		sp.clickOnRemoveItem();
		int itemsInBag = sp.getMainNavigationBar().numOfItemsInBag();
		assert(itemsInBag  == 0);
		
		
	}

}