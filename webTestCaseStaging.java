package yMwebMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webTestCaseStaging extends stagingWebSetUp {

	@Test
	public void browserTest() throws InterruptedException {

		driver.get("http://api-stage-aws.yesmadam.co.in/");
		Thread.sleep(5000);	
		System.out.println(driver.getTitle());
		System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
		Assert.assertEquals("Yes Madam - Salon at Home | Beauty Parlour Services at Home", driver.getTitle());
		driver.findElement(By.xpath("//button[@class=\"select_location_btn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("noida");
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();


}
}
