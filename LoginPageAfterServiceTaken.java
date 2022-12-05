package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.HidesKeyboard;

public class LoginPageAfterServiceTaken {
	WebDriver driver;
	By MobNumber = By.xpath("//input[@placeholder='10 digit mobile number']");
	By SubmitButton = By.xpath("//button[@class='btm_pas']");
	By OTP = By.xpath("//input[@name='otp']");

	// Constructor to initialize object
		public LoginPageAfterServiceTaken(WebDriver dr) {
			this.driver = dr;
	}

	public void LoginAfterServiceTaken(String MobileNumber, String SubmitButton, String OTP)
			throws InterruptedException {
		this.enterMobileNumber(MobileNumber);
		this.ClickOnSubmitButton(SubmitButton);
		this.enterOTP(OTP);
	}

	public void enterMobileNumber(String MobileNumber) throws InterruptedException {

		driver.findElement(MobNumber).sendKeys(MobileNumber);
		((HidesKeyboard) driver).hideKeyboard();

	}

	private void ClickOnSubmitButton(String submitButton) {
		driver.findElement(SubmitButton).click();

	}

	public void enterOTP(String otp) {
		driver.findElement(OTP).sendKeys(otp);
	}

}
