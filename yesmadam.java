package yMwebMobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumimplementation.SeleniumImplementation;

public class yesmadam {
	@FindBy(xpath="//button[@class='select_location_btn']")WebElement location;
	@FindBy(css="div.for_desk section.main_categories div.inner_container div.service_cont:nth-child(3) a:nth-child(1) > div.service_card")WebElement itemImage;
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")WebElement btnMore;
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")WebElement txtQuantity;
	@FindBy(xpath="//*[@id=\"group_1\"]")WebElement selectSize;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")WebElement btnAddToCart;
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")WebElement btnCheckout;
	//@FindBy(css="div#layer_cart a > span")WebElement btnCheckout;
	//@FindBy(xpath="//*[@id=\"product\"]")WebElement btnCheckout;
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]")WebElement cartText;
	
	SeleniumImplementation selenium;
	public yesmadam(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateAddToCart(WebDriver driver) throws InterruptedException {
		selenium.setText("noida sector 51", location);
		selenium.sendkey(location);
	
		selenium.click(itemImage);
		Thread.sleep(8000);

		selenium.click(btnMore);
		selenium.clear(txtQuantity);
		selenium.setText("3", txtQuantity);
		selenium.selectByVisibleText(selectSize, "M");
		selenium.click(btnAddToCart);
		selenium.clickUsingJavaScriptExecutor(btnCheckout, driver);
		selenium.refresh(driver);
		return selenium.validateText(driver, cartText, "3");
		
		
	}
	

}
