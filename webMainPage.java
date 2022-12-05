package LiveWebPages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppiumSetUp.browserSeUp;

public class webMainPage extends browserSeUp {
	WebDriver driver;

	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;

	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;

	public webMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterAddressName(String enterUrLocation) throws InterruptedException {
		LocationSearch.sendKeys(enterUrLocation);
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(5000);
		
	}

	public void SetUrLocationButton() {
		String getheadertext = SetUrLocationButton.getText().trim();
		SetUrLocationButton.click();
		assertEquals("SET YOUR LOCATION", getheadertext);
	}

}
