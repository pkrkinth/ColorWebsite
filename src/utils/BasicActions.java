package utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class BasicActions {

    public static WebDriver driver;
    static String baseUrl;

    //Firefox browser setup
    public static void firefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "/Users/prince/Desktop/websiteAutomation/ColorWebsite/driver/geckodriver");
        driver = new FirefoxDriver();
    }

    //Chrome browser setup
    public static void chromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/prince/Desktop/websiteAutomation/ColorWebsite/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Before
    public static void setUp() {
        firefoxBrowser();
        driver.manage().window().maximize();
        baseUrl = "https://color.adobe.com/";
        driver.get(baseUrl);
    }

    @After
    public static void tearDown() {
        driver.quit();
    }

    public static void closeTab() {
        driver.close();
    }

    public static void getScreenshot() {
        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            The below method will save the screen shot in destination directory with name "screenshot.png"
            FileHandler.copy(source, new File("/Users/prince/Desktop/website_automation/screenshots/screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
