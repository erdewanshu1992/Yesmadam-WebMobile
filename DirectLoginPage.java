package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.HidesKeyboard;

public class DirectLoginPage {
	WebDriver driver;
	By CitiesLive = By.xpath("//*[@id]/div/div[2]/div[1]/div[2]/div/div[3]/span[1]");
	By SetUrLocation = By.xpath("//button[@class=\"select_location_btn\"]");
	By LocationSearch = By.xpath("(//input[@type=\"text\"])[3]");
	By LoginButtton = By.xpath("//span[@style='color:#9c224b']");
	By MobNumber = By.xpath("//input[@placeholder='10 digit mobile number']");
	By SubmitButton = By.xpath("//button[@class='btm_pas']");
	By OTP = By.xpath("//input[@name='otp']");// OTP

	// Constructor to initialize object
		public DirectLoginPage(WebDriver dr) {
			this.driver = dr;
		
	}

	public void loginToWebmobile(String LogingButton, String MobileNumber, String SubmitButton, String OTP)
			throws InterruptedException {
		this.clickOnLoginButton(LogingButton);
		this.enterMobileNumber(MobileNumber);
		this.ClickOnSubmitButton(SubmitButton);
		this.enterOTP(OTP);
	}

	public void CitiesLiveVerify() {
		System.out.println(driver.findElement(CitiesLive).getText());

	}

	public void clickOnLoginButton(String LoginButton) {
		driver.findElement(LoginButtton).click();

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
