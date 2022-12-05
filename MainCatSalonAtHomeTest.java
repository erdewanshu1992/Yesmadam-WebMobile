package LiveWebPageWiseTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pages.AddToCartPage;

import AppiumSetUp.browserSeUp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MainCatSalonAtHomeTest extends browserSeUp{
	WebDriver driver;
	AddToCartPage page;

//	@BeforeTest
//	public void webBrowserlaunch() throws InterruptedException, MalformedURLException {
//
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setDeviceName("vivo");
//		options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");
//		options.setCapability("browserName", "Chrome");
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//		driver.get("https://www.yesmadam.com/");
//		page = new AddToCartPage(driver);
//		
//	}
	@Test
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToCart(driver));
	}

}
