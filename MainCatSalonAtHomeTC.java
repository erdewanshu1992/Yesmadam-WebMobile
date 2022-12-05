package LiveWebPageWiseTestCases;

import org.testng.annotations.Test;
import AppiumSetUp.browserSeUp;
import LiveWebPages.MainCatSalonAtHome;
import LiveWebPages.webMainPage;

public class MainCatSalonAtHomeTC extends browserSeUp {
	@Test()
	public void navigate_to_homepage_click_on_SetUrLocation() {

		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.SetUrLocationButton();

	}

	@Test(dependsOnMethods={"navigate_to_homepage_click_on_SetUrLocation"})
	public void enter_userAddress() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.enterAddressName("Noida sector 51");

	}
	
	@Test(priority = 3)
	public void MainCatSalonAtHome() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.SalonAtHome();
	}

	@Test(priority = 4)
	public void BestSellersVerify() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.BestSellersVerify();

	}

	@Test(dependsOnMethods={"BestSellersVerify"})
	public void AddToCartButtonClicked() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.AddToCartButtonClicked();

	}
	@Test(dependsOnMethods={"AddToCartButtonClicked"})
	public void CheckoutButtonVerify() throws InterruptedException {
		MainCatSalonAtHome = new MainCatSalonAtHome(driver);
		MainCatSalonAtHome.CheckoutButtonVerify();

	}

}
