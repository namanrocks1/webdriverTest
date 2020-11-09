package testgit.testgitserver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://portfolio.rediff.com/portfolio-login");
	}
	
	@Test
	public void doLoginTest() {
		
		driver.findElement(By.id("useremail")).sendKeys("testing@test.com");
		driver.findElement(By.id("userpass")).sendKeys("test123");
		driver.findElement(By.id("loginsubmit")).click();
	}
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
