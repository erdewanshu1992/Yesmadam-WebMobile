package LiveWebPageWiseTestCases;

import org.testng.annotations.Test;

import AppiumSetUp.browserSeUp;

import LiveWebPages.webMainPage;

public class WebMainPageTC extends browserSeUp {
	
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

}
