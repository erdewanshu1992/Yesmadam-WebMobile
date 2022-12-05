package LiveWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	@FindBy(xpath = "//span[@class='change_prdt']")
	WebElement ChangProduct;
	@FindBy(xpath = "//button[@class='done_btn']")
	WebElement Done;
	@FindBy(xpath = "//span[@class='remove_prdt']")
	WebElement Remove;
	@FindBy(xpath = "//button[@class='no_btn']")
	WebElement RemoveNo;
	@FindBy(xpath = "//span[@class='Checkout_btn']")
	WebElement Checkout;

	// Constructor to initialize object
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ChangeButtonVerify() {
		ChangProduct.click();

	}

	public void DoneButtonVerify() {
		Done.click();

	}

	public void RemoveButtonVerify() {
		Remove.click();
	}

	public void RemoveButtonNoVerify() {
		RemoveNo.click();

	}

	public void CheckoutButtonVerify2() {
		Checkout.click();

	}

}
