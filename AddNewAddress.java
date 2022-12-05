package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.HidesKeyboard;

public class AddNewAddress {
	WebDriver driver;
	By AddBuilding = By.xpath("(//input[@type='text'])[2]");
	By ColonyAddress = By.xpath("(//input[@type='text'])[3]");
	By SaveButton = By.xpath("//button[@class='save_add_btn']");
	By SaveButtonTest = By.xpath("//button[@class='save_add_btn']");

	// Constructor to initialize object
	public AddNewAddress(WebDriver driver) {
		this.driver = driver;
	}

	public void SaveButtonVerify() {
		driver.findElement(SaveButtonTest).click();
		System.out.println(driver.findElement(SaveButtonTest).getText());

	}

	public void AddUrAddressVerify(String BuildingName, String AddressName, String SaveButton)
			throws InterruptedException {
		this.enterBuldingName(BuildingName);
		this.enterColonyName(AddressName);
		this.ClickOnSubmitButton(SaveButton);
	}

	public void enterBuldingName(String UrAddress) throws InterruptedException {

		driver.findElement(AddBuilding).sendKeys(UrAddress);
		((HidesKeyboard) driver).hideKeyboard();

	}

	public void enterColonyName(String ColonyName) {
		driver.findElement(ColonyAddress).sendKeys(ColonyName);
	}

	private void ClickOnSubmitButton(String saveButton) {
		driver.findElement(SaveButton).click();

	}

}
