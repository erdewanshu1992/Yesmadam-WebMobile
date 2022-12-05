package library;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class ScreenShot {
	  public static void captureScreenShot(WebDriver driver, String ScreenShotName) {
                    try {
                                         File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                         FileUtils.copyFile(screenshot,new File("/home/yesmadam/eclipse-workspace/Appium/Screenshots"+ScreenShotName+".jpg"));
                             } catch (Exception e)
                               {
                                   System.out.println(e.getMessage());
                                    e.printStackTrace();
                                }
          }

}
