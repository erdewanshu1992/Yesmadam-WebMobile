package AnnotationsPageFactoryDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageFactorySetUp.GoogleSearchPage;

public class webYm {
	public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();

        // Create a new instance of the search page class
        // and initialize any WebElement fields in it.
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        // And now do the search.
        //page.searchFor("https://www.yesmadam.com/");
        page.searchFor("Yes Madam - Salon at Home | Beauty Parlour Services at Home");
        driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
        
    }

}