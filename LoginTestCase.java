package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.webMobileSetUp;

public class LoginTestCase extends webMobileSetUp {

	// Verify LoginPage
	@Test(priority = 1)
	public void CitiesLiveVerify() throws InterruptedException {
		lp.CitiesLiveVerify();
		Thread.sleep(5000);
		
	}
	/*
	@Test(priority = 2)
	public void SetUrLocationButtonVerify() throws InterruptedException {
		sl.SetUrLocationButtonVerify();
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 3)
	public void LocationSearchVerify() {
		sl.LocationSearch("Noida sector 51");
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	}
	*/
	
	// Direct Login to the Site 
	@Test(priority = 2)
	public void DirectLogin() throws InterruptedException {
		lp.loginToWebmobile("LogingButton", "9855566677", "SubmitButton", "2222");

	}

	
	@Test(priority = 5)
	public void listOfAllHomePageMainCat() throws InterruptedException {
		hpmcp.listOfAllHomePageMainCat();
		Thread.sleep(5000);

	}

	@Test(priority = 6)
	public void BeautyCareSubCat() throws InterruptedException {
		hpmcp.SalonAtHomeVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 7)
	public void lostOfAllBeautyCareSubCat() throws InterruptedException {
		ssp.listOfAllBeautyCareSubCat();
		Thread.sleep(5000);
	}
//
//	@Test(priority = 6)
//	public void BeautyCareSubCatVerify() throws InterruptedException {
//		ssp.BeautyCareSubCatVerify();
//		Thread.sleep(5000);
//	}

	@Test(priority = 8)
	public void BestSellersVerify() throws InterruptedException {
		ssp.BestSellersVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 9)
	public void AddToCartVerify() throws InterruptedException {
		ssp.AddToCartVerify();
		Thread.sleep(5000);
	}
	
	@Test(priority = 10)
	public void CheckoutVerify() throws InterruptedException {
		ssp.CheckoutVerify();
		Thread.sleep(5000);

	}
	/*
	@Test(priority = 11)
	public void LoginAfterServiceTakenVerify() throws InterruptedException {
		lpas.LoginAfterServiceTaken("9855566677", "SubmitButton", "2222");
		Thread.sleep(5000);

	}
	*/
	@Test(priority = 12)
	public void ChangeButtonVerify() throws InterruptedException {
		cp.ChangeButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 13)
	public void DoneButtonVerify() throws InterruptedException {
		cp.DoneButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 14)
	public void RemoveButtonVerify() throws InterruptedException {
		cp.RemoveButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 15)
	public void RemoveButtonNoVerify() throws InterruptedException {
		cp.RemoveButtonNoVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 16)
	public void CheckoutButtonVerify() throws InterruptedException {
		cp.CheckoutButtonVerify();
		Thread.sleep(15000);
	}
	/*
	@Test(priority = 17)
	public void SaveButtonVerify() throws InterruptedException {
		ana.SaveButtonVerify();
		Thread.sleep(5000);
	}
	
	@Test(priority = 18)
	public void AddUrAddressVerify() throws InterruptedException {
		ana.AddUrAddressVerify("Noida Main", "Sector 51", "SaveButton");
		Thread.sleep(5000);

	}
*/
	@Test(priority = 19)
	public void ChangeAddressVerify() throws InterruptedException {
		sps.ChangeAddressVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 20)
	public void BackArrowVerify() throws InterruptedException {
		sps.BackArrowVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 21)
	public void SlotNoteButtonVerify() throws InterruptedException {
		sps.SlotNoteAtButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 22)
	public void SavedAddressVerify() throws InterruptedException {
		sps.SavedAddressVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 23)
	public void lostOfAllSlotsDate() throws InterruptedException {
		sps.lostOfAllSlotsDate();
		Thread.sleep(5000);
	}

	@Test(priority = 24)
	public void lostOfAllPrimeTimeSlotsMorVerify() throws InterruptedException {
		sps.lostOfAllPrimeTimeSlotsMorVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 25)
	public void lostOfAllNormalSlotsVerify() throws InterruptedException {
	sps.lostOfAllNormalSlotsVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 26)
	public void lostOfAllPrimeTimeSlotsEveVerify() throws InterruptedException {
		sps.lostOfAllPrimeTimeSlotsEveVerify();
		Thread.sleep(5000);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Logout the site.
//    @Test(priority = 3)
//    public void Logout()
//     {
//                    hp.logout();
//      }
//Taking Screen shot on test fail
//     @AfterMethod
//     public void screenshot(ITestResult result)
//     {
//                i = i+1;
//                String name = "ScreenShot";
//                String x = name+String.valueOf(i);
//               if(ITestResult.FAILURE == result.getStatus())
//                 {
//                                ScreenShot.captureScreenShot(driver, x);
//                  }
//}
	@AfterTest
	public void closeBrowser() {
		// driver.close();
	}

}
