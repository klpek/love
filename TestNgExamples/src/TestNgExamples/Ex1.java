package TestNgExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex1 {
	private WebDriver driver;
	@BeforeMethod
	public void setUp(){
		
		driver=new FirefoxDriver();
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
