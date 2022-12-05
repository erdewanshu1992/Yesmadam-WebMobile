package LiveWebPages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMainCat {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='cat_card']")
	List<WebElement> MainCat;
	@FindBy(xpath = "//div[@class='cat_card']")
	WebElement SalonAtHome;

	// Constructor to initialize object
	public HomePageMainCat(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void listOfAllHomePageMainCat() {
		List<WebElement> allMainCats = MainCat;
		System.out.println(allMainCats.size());

		for (WebElement mainCat : allMainCats) {
			String name = mainCat.getText();
			System.out.println(name);
		}
	}

	public void SalonAtHomeVerify() {
		SalonAtHome.click();

	}

}
