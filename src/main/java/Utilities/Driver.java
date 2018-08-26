package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver = null;
    public static String browser = "chrome";

    public Driver()
    {
        initilize();
    }

    public static void initilize()
    {
        if (driver == null)
        {

            System.out.print("Inilizing new Driver");

            if (browser.equalsIgnoreCase("FF"))
                driver = new FirefoxDriver();

            else if (browser.equalsIgnoreCase("chrome"))
            {
                System.setProperty("webdriver.chrome.driver", "/Users/sumit.kumar/lithium/SumitPersonal/chromedriver");
                driver = new ChromeDriver();
            }

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }

    public static void close()
    {
        driver.close();
        driver = null;
    }

    public static void quit()
    {
        driver.quit();
        driver = null;
    }
}
