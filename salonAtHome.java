package rahulshettyacademy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class salonAtHome extends customerApp{
	@Test
	public void SalonAtHome() throws InterruptedException {
		  
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Salon\n"
				+ "At Home']")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		//Thread.sleep(3000);
		
       //Checkout		
		driver.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
		
	}

}
