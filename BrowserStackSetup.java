package browserStackSetupSimplePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserStackPagesSimplePOM.BrowserStackHomePage;
import browserStackPagesSimplePOM.BrowserStackSignUpPage;

public class BrowserStackSetup {
	//String driverPath = "C:\\geckodriver.exe";
	WebDriver driver;
	BrowserStackHomePage objBrowserStackHomePage;
	BrowserStackSignUpPage objBrowserStackSignUpPage;

	@BeforeTest
	public void setup() {
	//System.setProperty("webdriver.chrome.driver", "C:\\BrowserStack\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
	objBrowserStackHomePage = new BrowserStackHomePage(driver);
	objBrowserStackHomePage.verifyHeader();
	objBrowserStackHomePage.clickOnGetStarted();
	}

	@Test(priority = 2)
	public void enter_userDetails() {
	objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
	objBrowserStackSignUpPage.veryHeader();
	objBrowserStackSignUpPage.enterFullName("TestUser");
	objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
	objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
	}
	

}
