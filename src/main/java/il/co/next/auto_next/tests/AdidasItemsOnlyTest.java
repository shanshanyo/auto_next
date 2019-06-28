package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.AdidasPage;
import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.web.BottomToolBar;

public class AdidasItemsOnlyTest extends AbstractTest {
	
//this test validates that clicking on the Adidas logo transfers to Adidas only items page	
	
	@Test
	public void _006_adidasItemsOnlyTest() throws Exception {

		HomePage hp = loginToNext();
		hp.scrollToAdidasLogo();
		AdidasPage nap = hp.clickOnAdidasLogo();
		
		
	}

}
