package LiveWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumimplementation.SeleniumImplementation;

public class MainCatSalonAtHomePage {
	WebDriver driver;
	@FindBy(xpath="(//div[@class='cat_card'])[1]")WebElement SalonAtHome;
	@FindBy(xpath="(//div[@class='subcat_img'])[1]")WebElement BestSellers;
	@FindBy(xpath="(//span[@class='addtocart'])[1]")WebElement AddToCart;
	@FindBy(xpath="(//span[@class='addtocart'])[1]") WebElement CartCount;
	@FindBy(xpath="//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")WebElement Checkout;
	@FindBy(xpath="//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")WebElement CostCheckout;

	SeleniumImplementation selenium;
	public MainCatSalonAtHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateAddToCart(WebDriver driver) {
		selenium.performMouseHower(SalonAtHome, driver);
		selenium.click(BestSellers);
		//selenium.clear(txtQuantity);
		//selenium.setText("3", txtQuantity);
		//selenium.selectByVisibleText(selectSize, "M");
		selenium.click(AddToCart);
		//selenium.clickUsingJavaScriptExecutor(btnCheckout, driver);
		selenium.refresh(driver);
		//return selenium.validateText(driver, cartText, "3");
		return false;
			
	}
		

}
