package AppiumSetUp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

import LiveWebPages.MainCatSalonAtHome;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class browserSeUp {
	protected WebDriver driver;
	//LiveWebPages.webMainPage webMainPage;
	protected MainCatSalonAtHome MainCatSalonAtHome;

	

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

	

}
