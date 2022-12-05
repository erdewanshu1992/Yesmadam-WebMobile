package ymLiveWebMobilePageFactorySetUp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import ymLiveWebMobilePageFactory.webMainPage;

public class LoginThroughService {
	WebDriver driver;
	webMainPage webMainPage;
	webMainPageDirectLogin webMainPageDirectLogin;
	HomePageMainCat HomePageMainCat;
	MainCatSalonAtHome MainCatSalonAtHome;
	SchedulePage SchedulePage;
	CartPage CartPage;
	SelectUrServicePageAfterDirectLogin SelectUrServicePageAfterDirectLogin;

	@BeforeTest
	public void webBrowserlaunch() throws InterruptedException, MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("vivo");
		options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");
		options.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("http://api-stage-aws.yesmadam.co.in/");
		//driver.get("https://www.yesmadam.com/");
		String url = "https://www.yesmadam.com/";
		driver.get(url);
		Reporter.log("Chrome Invoked and navigated to URL: " + url + "<br>", true);
		//Checking page is navigated with the expected title
				String actual = driver.getTitle();
				String expected = "Yes Madam - Salon at Home | Beauty Parlour Services at Home";
				Assert.assertEquals(actual, expected);
				Reporter.log("Page Navigated." + "<br>", true);
		
		//System.out.println(driver.getTitle());
		//System.out.println("You are currently on the following URL" + driver.getCurrentUrl());
		//Assert.assertEquals("Yes Madam - Salon at Home | Beauty Parlour Services at Home", driver.getTitle());
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_SetUrLocation() {

		webMainPage = new webMainPage(driver);
		webMainPage.SetUrLocationButton();

	}

	@Test(priority = 2)
	public void enter_userAddress() throws InterruptedException {
		webMainPage = new webMainPage(driver);
		webMainPage.enterAddressName("Noida sector 51");

	}

	@Test(priority = 3)
	public void MainCatSalonAtHome() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.SalonAtHome();
	}

	@Test(priority = 4)
	public void BestSellersVerify() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.BestSellersVerify();

	}

	@Test(priority = 5)
	public void AddToCartButtonClicked() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.AddToCartButtonClicked();

	}
	@Test(priority = 6)
	public void CheckoutButtonVerify() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.CheckoutButtonVerify();

	}

//	@Test(priority = 8)
//	public void CostOnServicePage() throws InterruptedException {
//		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
//		MainCatSalonAtHome.CostOnServicePage();
//	}
//
//	@Test(priority = 7)
//	public void CheckoutButtonVerify() throws InterruptedException {
//		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
//		MainCatSalonAtHome.CheckoutButtonVerify();
//
//	}

//	@Test(priority = 7)
//	public void CheckoutButtonVerify1() throws InterruptedException {
//		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
//		MainCatSalonAtHome.CheckoutButtonVerify();
}
