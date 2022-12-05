package LiveWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectUrServicePageAfterDirectLogin {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='subcat_img']")
	List<WebElement> BeautyCareSubCats;
	@FindBy(xpath = "//div[@class='subcat_img']")
	WebElement BeautyCareSubCat;
	@FindBy(xpath = "//div[@class='cat_card']")
	WebElement SalonAtHome;
	@FindBy(xpath = "//div[@class='subcat_img']")
	WebElement Bestsellers;
	@FindBy(xpath = "(//span[@class='addtocart'])[1]")
	WebElement AddToCart;
	@FindBy(xpath = "(//div[@class='cart_right'])[1]")
	WebElement Checkout;

	// Constructor to initialize object
	public SelectUrServicePageAfterDirectLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void listOfAllBeautyCareSubCats() {
		List<WebElement> allSubCats = BeautyCareSubCats;
		System.out.println(allSubCats.size());

		for (WebElement beautyCareSubCats : allSubCats) {
			String name = beautyCareSubCats.getText();
			System.out.println(name);
		}
	}

	public void BeautyCareSubCatVerify() {
		BeautyCareSubCat.click();

	}

	public void BestSellersVerify() {
		Bestsellers.click();

	}

	public void AddToCartVerify() {
		AddToCart.click();

	}

	public void CheckoutVerify() {
		Checkout.click();

	}

}
