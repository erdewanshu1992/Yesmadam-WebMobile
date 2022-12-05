package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;

	By HomePageFooter = By.xpath("//*[@id]/div/div[2]/div[2]/div[6]/img[12]");
	By AllFooter = By.xpath("//*[@id]/div/div[2]/div[2]/div[6]/img[1]");
	By AllTestimonials = By.xpath("//*[@id]/div/div[2]/div[2]/div[4]/div/div/div/div/div[3]");
	By Testimonial3 = By.xpath("//*[@id]/div/div[2]/div[2]/div[4]/div/div/div/div/div[3]");
	By Testimonial4 = By.xpath("//*[@id]/div/div[2]/div[2]/div[4]/div/div/div/div/div[4]");

	// Constructor to initialize object
	public HomePage(WebDriver dr) {
		this.driver = dr;
	}

	public void listOfAllTestimonials() {
		List<WebElement> AllTestimonial = driver.findElements(AllTestimonials);
		System.out.println(AllTestimonial.size());

		for (WebElement AllTestimonials : AllTestimonial) {
			String name = AllTestimonials.getText();
			System.out.println(name);
		}
	}

	public void listOfAllFooterBanner() {
		List<WebElement> allFooters = driver.findElements(AllFooter);
		System.out.println(allFooters.size());

		for (WebElement AllFooter : allFooters) {
			String name = AllFooter.getText();
			System.out.println(name);
		}
	}

	public void VerifyHomePageFooter() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", ""); // Scroll
		// String text =
		// driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
		// Assert.assertEquals(text, "Devops");
		driver.findElement(HomePageFooter).click();
	}

	public void VerifyAllfooters() {
		System.out.println(driver.findElement(AllFooter).getText());
	}

	public void Testimonials() {
		WebElement draggable = driver.findElement(Testimonial3);
		WebElement droppable = driver.findElement(Testimonial4);
		new Actions(driver).dragAndDrop(draggable, droppable).perform();
	}

	public void Testimonialsvidoes() {
		WebElement draggable = driver.findElement(Testimonial3);

		// driver.findElement(Testimonial3).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_LEFT);

	}

//	// why we use return type
//	public String VerifyLoginPages() {
//		return driver.findElement(LoginPage).getText();
//	}
//	              public void logout() {
//	                             driver.findElement(logout).click();
//	                }

}
