package library;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.IExecutionListener;
import org.testng.annotations.Test;

public class TestNG_ToDoGroup extends Helper implements IExecutionListener {
    /* WebDriver driver; */
    /* private ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>(); */
    public static String status = "passed";
 
    @Override
    public void onExecutionStart()
    {
        System.out.println("onExecutionStart");
    }
 
    @Test (priority = 1, groups = { "ToDo" })
    public void test_Selenium4_ToDoApp_Test1() throws InterruptedException, MalformedURLException {
        setupThread("test_Selenium4_ToDoApp_Test1", "test_Selenium4_ToDoApp_Test1",
                "Windows 10", "Chrome", "106.0.5249.119");
        WebDriver webdriver = getDriver();
        webdriver.navigate().to("https://lambdatest.github.io/sample-todo-app/");
        webdriver.manage().window().maximize();
        System.out.println("Started session");
        Thread.sleep(5000);
 
        try
        {
            /* Let's mark done first two items in the list. */
            webdriver.findElement(By.name("li1")).click();
            webdriver.findElement(By.name("li2")).click();
 
            /* Let's add an item in the list. */
            webdriver.findElement(By.id("sampletodotext")).sendKeys("Happy Testing at LambdaTest");
            webdriver.findElement(By.id("addbutton")).click();
 
            /* Let's check that the item we added is added in the list. */
            String enteredText = webdriver.findElement(By.xpath("/html/body/div/div/div/ul/li[6]/span")).getText();
            if (enteredText.equals("Happy Testing at LambdaTest")) {
                System.out.println("Demonstration is complete");
                status = "passed";
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        if (webdriver != null)
        {
            ((JavascriptExecutor) webdriver).executeScript("lambda-status="+status+"");
            webdriver.quit();
        }
    }
 
    @Test (priority = 2, groups = { "ToDo" })
    public void test_Selenium4_ToDoApp_Test2() throws InterruptedException, MalformedURLException {
        setupThread("test_Selenium4_ToDoApp_Test2", "test_Selenium4_ToDoApp_Test2",
                "MacOS Catalina", "MicrosoftEdge", "87.0");
        WebDriver webdriver = getDriver();
        webdriver.navigate().to("https://lambdatest.github.io/sample-todo-app/");
        webdriver.manage().window().maximize();
        System.out.println("Started session");
        Thread.sleep(5000);
 
        try
        {
            /* Let's mark done first three items in the list. */
            webdriver.findElement(By.name("li1")).click();
            webdriver.findElement(By.name("li2")).click();
            webdriver.findElement(By.name("li3")).click();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        status = "passed";
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
