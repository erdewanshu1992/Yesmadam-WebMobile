package rahulshettyacademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class customerApp extends BaseTest {
//	public AndroidDriver driver;
//	public AppiumDriverLocalService service;
	WebElement element;
	@Test
	public void AppActivity () throws InterruptedException {
		
		//driver.startActivity(new Activity("com.example", "ActivityName"));

		driver.startActivity(new Activity("yesmadamservices.app.com.yesmadamservices", "yesmadam.app.com.yesmadamservices.module.user.SplashActivity"));

		
//		driver.startActivity(new Activity("yesmadamservices.app.com.yesmadamservices", "yesmadam.app.com.yesmadamservices.module.home.menu.ContactUsActivity"));

//		Activity activity = new Activity("yesmadamservices.app.com.yesmadamservices", "yesmadam.app.com.yesmadamservices.module.user.SplashActivity");
//		driver.startActivity(activity);

		//Wallet strip
		//driver.findElement(By.xpath("//android.widget.TextView[@text='YM Wallet']")).click();
		//Wallet strip
		driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vActionText")).click();
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
//	    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n"
//	    		+ "")).click();
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(AppiumBy.accessibilityId("Booking")).click();//Bottom Booking
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Beauty\"]/android.widget.ImageView")).click();//Bottom Beauty
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Prime\"]/android.widget.ImageView")).click();//Bottom Prime
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Refer\"]/android.widget.ImageView")).click();//Bottom Refer
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView")).click();//Bottom Home
		// Salon @ Home
		driver.findElement(By.xpath("//android.widget.TextView[@text='Salon\n"
				+ "At Home']")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
		//scrollToEndAction();- not working
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Charm Booster (Rica WaxIt  + CleanUp + Bleach)\"));"));
		
//		int productCount =	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//		
//		for(int i =0;i<productCount;i++)
//		{
//			String productName =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//			
//			if(productName.equalsIgnoreCase("Charm Booster (Rica WaxIt  + CleanUp + Bleach)"))
//			{
//				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//			}
//		}
//		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
//	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
//		
		//String lastPageProduct =driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		//Assert.assertEquals(lastPageProduct, "Charm Booster (Rica WaxIt  + CleanUp + Bleach)");
		

	/*	
		
		//where to scroll is known prior
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Salon\n"
	    		+ "At Home\"));")).click();

		//No prior idea
		scrollToEndAction();
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		//application back arrow
	    driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vBack")).click();
	    //Female Spa
	    //where to scroll is known prior
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Female\n"
	    		+ "Spa\"));")).click();
	    //LED Facial
	    //application back arrow
	    driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vBack")).click();
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LED\n"
	    		+ "Facial\"));")).click();
	    //Male Massage
	    //application back arrow
	    driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vBack")).click();
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Male\n"
	    		+ "Massage\"));")).click();
	    //Male Grooming
	    //application back arrow
	    driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vBack")).click();
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Male\n"
	    		+ "Grooming\"));")).click();
	    //Female Hair Service
	    //application back arrow
	    driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vBack")).click();
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Female\n"
	    		+ "Hair Services\"));")).click();
	    //application back arrow
	    driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vBack")).click();
	    
	    //Salon at home
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Salon\n"
				+ "At Home']")).click();
	    		
*/
		
	}

}
