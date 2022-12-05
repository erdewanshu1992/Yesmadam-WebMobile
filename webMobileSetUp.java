package pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class webMobileSetUp {
	public WebDriver driver;
	protected DirectLoginPage lp;
	protected HomePage hp;
	protected HomePageMainCat hpmcp;
	protected CartPage cp;
	protected SchedulePage sps;
	protected MainCatSalonAtHome mcat;
	protected SelectUrServicePageAfterDirectLogin ssp;
	protected SetLocation sl;
	protected LoginPageAfterServiceTaken lpas;
	protected AddNewAddress ana;

	@BeforeTest
	public void browserlaunch() throws InterruptedException, MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("vivo");
		options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");
		options.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.get("http://api-stage-aws.yesmadam.co.in/");
		driver.get("https://www.yesmadam.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println("You are currently on the following URL" + driver.getCurrentUrl());
		Assert.assertEquals("Yes Madam - Salon at Home | Beauty Parlour Services at Home", driver.getTitle());

		// driver =
		// Browser.StartBrowser("Chrome","http://api-stage-aws.yesmadam.co.in/");
		Thread.sleep(3000);
		lp = new DirectLoginPage(driver);
		hp = new HomePage(driver);
		hpmcp = new HomePageMainCat(driver);
		cp = new CartPage(driver);
		sps = new SchedulePage(driver);
		mcat = new MainCatSalonAtHome(driver);
		ssp = new SelectUrServicePageAfterDirectLogin(driver);
		sl = new SetLocation(driver);
		lpas = new LoginPageAfterServiceTaken(driver);
		ana = new AddNewAddress(driver);

	}

}
