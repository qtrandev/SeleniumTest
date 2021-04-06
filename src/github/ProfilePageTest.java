package github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfilePageTest {

	private static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver.exe");
		//driver = new FirefoxDriver();
		//FirefoxOptions cap = new FirefoxOptions();
		//cap.setCapability("marionette", true);
		//driver = new FirefoxDriver(cap);
	}
	
	@Test
	public static void openPage() throws InterruptedException {
		
		ProfilePage profilePage = new ProfilePage(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		driver.get("https://github.com/qtrandev");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		profilePage.clickRepositoriesTab();
		Thread.sleep(3000);
		profilePage.clickProjectsTab();
		Thread.sleep(3000);
		profilePage.clickPackagesTab();
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);
		profilePage.clickOverviewTab();
		
		Thread.sleep(3000);
		profilePage.clickLeafletTransitLink();
		
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0,5000)");
		
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0,-5000)");
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}
}













