package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.web.BottomToolBar;

public class FollowOnInstagramTest extends AbstractTest {

	//this method clicks on Instagram icon and verify the 'next instagram account' is shown	
	
	@Test
	public void _008_followOnInstagramTest() throws Exception {

		HomePage homePage = loginToNext();
		System.out.println("1");
		//this method clicks on Instagram icon and verify the 'next Instagram account' is shown
		BottomToolBar btb = homePage.getBottomToolBar();
		btb.ClickOnInstagramIcon(); 
		
	}

}