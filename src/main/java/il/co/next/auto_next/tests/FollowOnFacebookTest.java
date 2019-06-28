package il.co.next.auto_next.tests;

import org.testng.annotations.Test;

import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.web.BottomToolBar;


//this method clicks on facebook icon and verify the 'next facebook account' is shown

public class FollowOnFacebookTest extends AbstractTest{
	@Test
	public void _007_followOnFacebooktest() throws Exception {

		HomePage homePage = loginToNext();
		BottomToolBar btb = homePage.getBottomToolBar();
		btb.ClickOnFacebookIcon(); 
		
	}
	

}