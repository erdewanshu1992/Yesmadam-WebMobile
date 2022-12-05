package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SetLocation {

	WebDriver driver;
	By SetUrLocationButton = By.xpath("//button[@class=\"select_location_btn\"]");
	By LocationSearch = By.xpath("(//input[@type=\"text\"])[3]");

	// Constructor to initialize object
	//public SetLocation(WebDriver driver) {
		//this.driver = driver;
	// Constructor to initialize object
		public SetLocation(WebDriver dr) {
			this.driver = dr;
	}

	public void ServiceArea(String Location) throws InterruptedException {
		this.LocationSearch(Location);

	}

	public void SetUrLocationButtonVerify() {
		System.out.println(driver.findElement(SetUrLocationButton).getText());
		driver.findElement(SetUrLocationButton).click();

	}

	public void LocationSearch(String LocationName) {
		driver.findElement(LocationSearch).sendKeys(LocationName);
//		Actions act = new Actions(driver);
//	    act.sendKeys(Keys.DOWN).perform();
//	    act.sendKeys(Keys.ENTER).perform();

	}

}
