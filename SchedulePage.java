package LiveWebPages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulePage {
	WebDriver driver;
	@FindBy(xpath="//*[@id]/div/div/div/div[5]/div[2]/div[2]/span")WebElement Checkout;
	@FindBy(xpath="//span[@class='change_address']") WebElement ChangAddress;
	@FindBy(xpath="//i[@class='fa fa-angle-left']")WebElement Back;
	@FindBy(xpath="(//div[@class='address_card'])[4]")WebElement Noida18;
	@FindBy(xpath="//*[@id]/div/div/div/span[2]/button")WebElement Proceed;
	@FindBy(xpath="//span[@class='slot_note']")WebElement SlotNoteAtBottom;
	@FindBy(xpath="//div[@class='address_sec']")WebElement SavedAddress;
	@FindBy(xpath="/div[@class='date_section'] ")List<WebElement> AvailableDate;
	@FindBy(xpath="(//div[@class='slots_flex'])[1]")List<WebElement> TimeSlotsList;
	@FindBy(xpath="(//div[@class='slots_flex'])[2]")List<WebElement> NormalSlots;
	@FindBy(xpath="(//div[@class='slots_flex'])[3]")List<WebElement> PrimeTimeSlotsEve;

	// Constructor to initialize object
			public SchedulePage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
	}
			public void CheckoutVerify() {
				Checkout.click();

			}

	public void ChangeAddressVerify() {
		ChangAddress.click();

	}

	public void BackArrowVerify() {
		//driver.findElement(Back).click();
		Back.click();

	}

	public void ChangeAddressToNoida18Verify() {
		Noida18.click();

	}

	public void ProceedButtonVerify() {
		Proceed.click();

	}

	public void SlotNoteAtButtonVerify() {
		System.out.println(SlotNoteAtBottom.getText());

	}

	public void SavedAddressVerify() {
		System.out.println(SavedAddress.getText());

	}

//	public void AvailableDateVerify() {
//		System.out.println(driver.findElement(AvailableDate).getText());
//
//	}

	public void lostOfAllSlotsDate() {
		List<WebElement> allDates = AvailableDate;
		System.out.println(allDates.size());

		for (WebElement lostOfAllSlotsDate : allDates) {
			String date = lostOfAllSlotsDate.getText();
			System.out.println(date);
		}

	}

//	public void PrimeTimeSlotsMorVerify() {
//		System.out.println(driver.findElement(PrimeTimeSlotsMor).getText());
//
//	}

	public void lostOfAllPrimeTimeSlotsMorVerify() {
		List<WebElement> allSlotsTime = TimeSlotsList;
		System.out.println(allSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}

	}

//	public void NormalSlotsVerify() {
//		System.out.println(driver.findElement(NormalSlots).getText());
//
//	}

	public void lostOfAllNormalSlotsVerify() {
		List<WebElement> allNormalSlotsTime = NormalSlots;
		System.out.println(allNormalSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allNormalSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}

	}

//	public void PrimeTimeSlotsEveVerify() {
//		System.out.println(driver.findElement(PrimeTimeSlotsEve).getText());
//
//	}

	public void lostOfAllPrimeTimeSlotsEveVerify() {
		List<WebElement> allPrimeEveSlotsTime = PrimeTimeSlotsEve;
		System.out.println(allPrimeEveSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allPrimeEveSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}

	}


}
