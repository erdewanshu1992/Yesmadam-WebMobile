package library;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IExecutionListener;
import org.testng.annotations.Test;

public class TestNG_SearchGroup extends Helper implements IExecutionListener
{
    public static String status = "passed";
 
    @Override
    public void onExecutionStart()
    {
        System.out.println("onExecutionStart");
    }
 
   @Test (priority = 1, groups = { "Search" })
    public void test_GoogleSearch() throws InterruptedException, MalformedURLException
    {
        String search_string =" LambdaTest";
        String exp_title = "Most Powerful Cross Browser Testing Tool Online | LambdaTest";
 
        setupThread("test_GoogleSearch", "test_GoogleSearch",
                "Windows 10", "Chrome", "latest");
        WebDriver webdriver = getDriver();
        webdriver.navigate().to("https://www.google.com");
        webdriver.manage().window().maximize();
        System.out.println("Started session");
 
        try {
            /* Enter the search term in the Google Search Box */
            WebElement search_box = webdriver.findElement(By.xpath("//input[@name='q']"));
            search_box.sendKeys(search_string);
 
            search_box.submit();
            Thread.sleep(3000);
 
            /* Click on the first result which will open up the LambdaTest homepage */
            WebElement lt_link = webdriver.findElement(By.xpath("//span[.='LambdaTest: Most Powerful Cross Browser Testing Tool Online']"));
            lt_link.click();
            Thread.sleep(5000);
 
            String curr_window_title = webdriver.getTitle();
            Assert.assertEquals(curr_window_title, exp_title);
            status = "passed";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (webdriver != null)
        {
            ((JavascriptExecutor) webdriver).executeScript("lambda-status="+status+"");
            webdriver.quit();
        }
    }
 
    @Test (priority = 2, groups = { "Search" })
    public void test_BingSearch() throws InterruptedException, MalformedURLException {
        String search_string ="LambdaTest Blog";
        String exp_title = "LambdaTest | A Cross Browser Testing Blog";
 
        setupThread("test_BingSearch", "test_BingSearch", "MacOS Catalina",
                "Safari", "13.0");
        WebDriver webdriver = getDriver();
        webdriver.navigate().to("https://www.bing.com");
        webdriver.manage().window().maximize();
        System.out.println("Started session");
 
        try {
            /* Enter the search term in the Google Search Box */
            WebElement search_box = webdriver.findElement(By.xpath("//input[@id='sb_form_q']"));
            search_box.sendKeys(search_string + Keys.ENTER);
            Thread.sleep(3000);
 
            /* Click on the first result which will open up the LambdaTest homepage */
            WebElement lt_link = webdriver.findElement(By.xpath("//a[.='LambdaTest | A Cross Browser Testing Blog']"));
            lt_link.click();
            Thread.sleep(5000);
 
            String curr_window_title = webdriver.getTitle();
            Assert.assertEquals(curr_window_title, exp_title);
            status = "passed";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (webdriver != null)
        {
            ((JavascriptExecutor) webdriver).executeScript("lambda-status="+status+"");
            webdriver.quit();
        }
    }
 
    @Override
    public void onExecutionFinish()
    {
        System.out.println("onExecutionFinish");
    }

}
