package il.co.next.auto_next.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import il.co.next.auto_next.pages.HomePage;
import il.co.next.auto_next.pages.LoginPage;

//this test confirms the Login action

public class LoginToNext extends AbstractTest{
	@Test
	public void _002_loginTest() throws Exception {
		loginToNext();
	}
}
