

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class rc_az1 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.amazon.com/");
		selenium.start();
	}

	@Test
	public void testRc_az1() throws Exception {
		selenium.open("http://www.amazon.com/");
		selenium.click("id=twotabsearchtextbox");
		selenium.type("id=twotabsearchtextbox", "gerry jackets women");
		selenium.click("css=input.nav-input");
		selenium.waitForPageToLoad("70000");
		selenium.click("css=span.nav-logo-base.nav-sprite");
		selenium.waitForPageToLoad("70000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
