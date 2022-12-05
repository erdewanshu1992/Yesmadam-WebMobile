package LiveWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.HidesKeyboard;

public class webMainPageDirectLogin {

	WebDriver driver;
	@FindBy(xpath="//*[@id]/div/div[2]/div[1]/div[2]/div/div[3]/span[1]") WebElement CitiesLive;
	@FindBy(xpath="//button[@class=\"select_location_btn\"]")WebElement SetUrLocation;
	@FindBy(xpath="(//input[@type=\"text\"])[3]")WebElement LocationSearch;
	@FindBy(xpath="//span[@style='color:#9c224b']")WebElement LoginButtton;
	@FindBy(xpath= "//input[@placeholder='10 digit mobile number']")WebElement MobNumber;
	@FindBy(xpath="//button[@class='btm_pas']")WebElement SubmitButton;
	@FindBy(xpath="//input[@name='otp']")WebElement OTP;

	// Constructor to initialize object
	public webMainPageDirectLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void CitiesLiveVerify() {
		//System.out.println(driver.findElement(CitiesLive).getText());
		CitiesLive.getText();

	}

	public void clickOnLoginButton() {
		//driver.findElement(LoginButtton).click();
		LoginButtton.click();

	}

	public void enterMobileNumber(String MobileNumber) throws InterruptedException {

		MobNumber.sendKeys(MobileNumber);
		((HidesKeyboard) driver).hideKeyboard();

	}

	//private void ClickOnSubmitButton(String submitButton) {
		public void ClickOnSubmitButton() {
		SubmitButton.click();

	}

	public void enterOTP(String otp) {
		//driver.findElement(OTP).sendKeys(otp);
		OTP.sendKeys(otp);

	}

}
