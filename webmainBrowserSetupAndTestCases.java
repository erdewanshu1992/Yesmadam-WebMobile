package ymLiveWebMobilePageFactorySetUp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import ymLiveWebMobilePageFactory.webMainPage;

public class webmainBrowserSetupAndTestCases {
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
		driver.get("https://www.yesmadam.com/");
		System.out.println(driver.getTitle());
		System.out.println("You are currently on the following URL" + driver.getCurrentUrl());
		Assert.assertEquals("Yes Madam - Salon at Home | Beauty Parlour Services at Home", driver.getTitle());
	}

	/*
	 * @Test(priority = 1) public void navigate_to_homepage_click_on_SetUrLocation()
	 * { webMainPage = new webMainPage(driver); webMainPage.SetUrLocationButton();
	 * 
	 * }
	 * 
	 * @Test(priority = 2) public void enter_userAddress() throws
	 * InterruptedException { webMainPage = new webMainPage(driver);
	 * webMainPage.enterAddressName("Noida sector 51");
	 * 
	 * }
	 */
	@Test(priority = 3)
	public void clickOnLoginButton() throws InterruptedException {
		webMainPageDirectLogin = new webMainPageDirectLogin(driver);
		webMainPageDirectLogin.clickOnLoginButton();

	}

	@Test(priority = 4)
	public void enterMobileNumber() throws InterruptedException {
		webMainPageDirectLogin = new webMainPageDirectLogin(driver);
		webMainPageDirectLogin.enterMobileNumber("9855566677");

	}

	@Test(priority = 5)
	public void ClickOnSubmitButton() throws InterruptedException {
		webMainPageDirectLogin = new webMainPageDirectLogin(driver);
		webMainPageDirectLogin.ClickOnSubmitButton();

	}

	@Test(priority = 6)
	public void enterOTP() throws InterruptedException {
		webMainPageDirectLogin = new webMainPageDirectLogin(driver);
		webMainPageDirectLogin.enterOTP("2222");

	}

	@Test(priority = 7)
	public void listOfAllHomePageMainCat() throws InterruptedException {
		HomePageMainCat = new HomePageMainCat(driver);
		HomePageMainCat.listOfAllHomePageMainCat();
		Thread.sleep(5000);
	}

	@Test(priority = 8)
	public void SalonAtHomeVerify() throws InterruptedException {
		HomePageMainCat = new HomePageMainCat(driver);
		HomePageMainCat.SalonAtHomeVerify();
		Thread.sleep(5000);
	}

	/*
	 * @Test(priority = 9) public void BestSellersVerify() throws
	 * InterruptedException { MainCatSalonAtHome = new MainCatSalonAtHome(driver);
	 * MainCatSalonAtHome.BestSellersVerify();
	 * 
	 * }
	 * 
	 * @Test(priority = 10) public void AddToCartButtonVerify() throws
	 * InterruptedException { MainCatSalonAtHome = new MainCatSalonAtHome(driver);
	 * MainCatSalonAtHome.AddToCartButtonVerify();
	 * 
	 * }
	 */

	@Test(priority = 9)
	public void listOfAllBeautyCareSubCats() throws InterruptedException {
		SelectUrServicePageAfterDirectLogin = new SelectUrServicePageAfterDirectLogin(driver);
		SelectUrServicePageAfterDirectLogin.listOfAllBeautyCareSubCats();
		Thread.sleep(5000);

	}

	@Test(priority = 10)
	public void BeautyCareSubCatVerify() throws InterruptedException {
		SelectUrServicePageAfterDirectLogin = new SelectUrServicePageAfterDirectLogin(driver);
		SelectUrServicePageAfterDirectLogin.BeautyCareSubCatVerify();
		Thread.sleep(5000);

	}

//	@Test(priority = 11)
//	public void BestSellersVerify() {
//		SelectUrServicePageAfterDirectLogin = new SelectUrServicePageAfterDirectLogin(driver);
//		SelectUrServicePageAfterDirectLogin.BestSellersVerify();
//
//	}
	@Test(priority = 12)
	public void AddToCartVerify() throws InterruptedException {
		SelectUrServicePageAfterDirectLogin = new SelectUrServicePageAfterDirectLogin(driver);
		SelectUrServicePageAfterDirectLogin.AddToCartVerify();
		Thread.sleep(5000);

	}

	@Test(priority = 13)
	public void CheckoutVerify() throws InterruptedException {
		SelectUrServicePageAfterDirectLogin = new SelectUrServicePageAfterDirectLogin(driver);
		SelectUrServicePageAfterDirectLogin.CheckoutVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 14)
	public void ChangeButtonVerify() throws InterruptedException {
		CartPage = new CartPage(driver);
		CartPage.ChangeButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 15)
	public void DoneButtonVerify() throws InterruptedException {
		CartPage = new CartPage(driver);
		CartPage.DoneButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 16)
	public void RemoveButtonVerify() throws InterruptedException {
		CartPage = new CartPage(driver);
		CartPage.RemoveButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 17)
	public void RemoveButtonNoVerify() throws InterruptedException {
		CartPage = new CartPage(driver);
		CartPage.RemoveButtonNoVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 18)
	public void CheckoutButtonVerify2() throws InterruptedException {
		CartPage = new CartPage(driver);
		CartPage.CheckoutButtonVerify2();
		Thread.sleep(15000);
	}

	@Test(priority = 19)
	public void ChangeAddressVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.ChangeAddressVerify();
		Thread.sleep(15000);
	}

	@Test(priority = 20)
	public void BackArrowVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.BackArrowVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 21)
	public void SavedAddressVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.SavedAddressVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 22)
	public void SlotNoteAtButtonVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.SlotNoteAtButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 23)
	public void lostOfAllSlotsDate() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.lostOfAllSlotsDate();
		Thread.sleep(5000);
	}

	@Test(priority = 24)
	public void lostOfAllPrimeTimeSlotsMorVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.lostOfAllPrimeTimeSlotsMorVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 25)
	public void lostOfAllNormalSlotsVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.lostOfAllNormalSlotsVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 26)
	public void lostOfAllPrimeTimeSlotsEveVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.lostOfAllPrimeTimeSlotsEveVerify();
		Thread.sleep(5000);

	}

//	@Test(priority = 26)
//	public void ChangeAddressToNoida18Verify() throws InterruptedException {
//		SchedulePage = new SchedulePage(driver);
//		SchedulePage.ChangeAddressToNoida18Verify();
//		Thread.sleep(5000);
//	}

	@Test(priority = 27)
	public void ProceedButtonVerify() throws InterruptedException {
		SchedulePage = new SchedulePage(driver);
		SchedulePage.ProceedButtonVerify();
		Thread.sleep(5000);
	}

}
