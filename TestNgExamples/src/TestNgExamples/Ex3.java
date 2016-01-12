package TestNgExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex3 {
	private WebDriver driver;
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.ie.driver","C://Padmini//Selenium//IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://amazon.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws InterruptedException{
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Women's Jackets");
		Thread.sleep(2000);
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".nav-logo-base.nav-sprite"));
		
	}
     @AfterMethod
     public void tearDown(){
    	 driver.close();
    	 
     }


}
