package LiveWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainCatSalonAtHome {
	WebDriver driver;
	@FindBy(xpath="(//div[@class='cat_card'])[1]")WebElement SalonAtHome;
	@FindBy(xpath="(//div[@class='subcat_img'])[1]")WebElement BestSellers;
	@FindBy(xpath="(//span[@class='addtocart'])[1]")WebElement AddToCart;
	@FindBy(xpath="(//span[@class='addtocart'])[1]")List<WebElement> CartCount;
	@FindBy(xpath="//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")WebElement Checkout;
	@FindBy(xpath="//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")List<WebElement> CostCheckout;

	// Constructor to initialize object
		public MainCatSalonAtHome(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}

	public void SalonAtHome() {
		SalonAtHome.click();
	}

	public void BestSellersVerify() {
		BestSellers.click();

	}

	//public void AddToCartButtonVerify() {
		//AddToCart.click();
		public void AddToCartButtonVerify() throws InterruptedException {
			List<WebElement> element = CartCount;
			  for(WebElement web : element) {
			     String addToCartCount =  web.getText();
			     int length = addToCartCount.length();
			     String Count = addToCartCount.substring(1, length);
			     System.out.println("Amount : "+ Count);
			     Thread.sleep(1000);
			  }

	}
		public void AddToCartButtonClicked() {
			AddToCart.click();
		}

	public void CheckoutButtonVerify() {
		Checkout.click();

	}
	public void CostOnServicePage() throws InterruptedException {
		List<WebElement> element = CostCheckout;
		  for(WebElement web : element) {
		     String amount =  web.getText();
		     int length = amount.length();
		     String price = amount.substring(1, length);
		     System.out.println("Amount : "+ price);
		     Thread.sleep(1000);
		  }
	}


}
