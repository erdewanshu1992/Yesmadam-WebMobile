package rahulshettyacademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hairgennie {
	//WebDriverException driver;
	@Test
	public void Hairgennie() {
	
		WebDriver driver = new ChromeDriver();//Start the session
		driver.get("https://hairgennie.com/");//Take action on browser
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));//Establish Waiting Strategy
		driver.manage().window().maximize();
        //String title = driver.getTitle();//Request browser information
		driver.findElement(By.id("//*[@id=\"AccessibleNav\"]/ul/li[3]/a")).click();
        
		
		
	}

}
