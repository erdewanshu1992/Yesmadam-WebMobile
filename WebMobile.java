package rahulshettyacademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebMobile extends BrowserBaseTest{
	
	

	@Test
	public void browserTest() throws InterruptedException
	
	{

		driver.get("https://www.yesmadam.com/");
		Thread.sleep(5000);	
		System.out.println(driver.getTitle());
		System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
		Assert.assertEquals("Yes Madam - Salon at Home | Beauty Parlour Services at Home", driver.getTitle());
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@class=\"select_location_btn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("noida");
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();


	
//		driver.getLocationContext();

//	Actions act = new Actions(driver);
//    act.sendKeys(Keys.DOWN).perform();
//    act.sendKeys(Keys.ENTER).perform();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();

		
		
		
		
		
		// WebElement clickable = driver.findElement(By.xpath("//android.widget.Button[@text='Allow']"));
	    //    new Actions(driver)
	            //    .moveToElement(clickable)
	            //    .pause(Duration.ofSeconds(1))
	       //         .clickAndHold()
	          //      .pause(Duration.ofSeconds(1))
	         //        .sendKeys("abc")
	       //        .perform();
		
//		driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
//		driver.switchTo().alert().accept();
//		WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button[2]"));//Location pop up
//		element.click();
//		Thread.sleep(3000);
		
//		driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");	//Scroll
//		String text = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
//		Assert.assertEquals(text, "Devops");

}
	}
