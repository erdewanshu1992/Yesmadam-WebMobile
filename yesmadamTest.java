package yMwebMobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class yesmadamTest {
	yesmadam page;
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
			
								
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("vivo");
			
			options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");//
			options.setCapability("browserName", "Chrome");
			
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 driver.get("https://www.yesmadam.com/");
			 page = new yesmadam(driver);
			 
	}
	@Test
	public void validateAddToCart() throws InterruptedException {
		Assert.assertTrue(page.validateAddToCart(driver));
		//Thread.sleep(10000);
	}

}
