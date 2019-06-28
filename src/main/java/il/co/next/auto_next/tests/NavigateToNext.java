package il.co.next.auto_next.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import il.co.next.auto_next.pages.HomePage;


public class NavigateToNext extends AbstractTest{
	
//this test navigates to NEXT website
	
	@Test
	public void _001_navigateToHomepage() throws Exception {
		HomePage homePage = browseToUrl("http://www.next.co.il/en");
	
		
	}
	

}