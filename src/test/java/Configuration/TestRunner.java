package Configuration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class TestRunner {


    public static WebDriver driver;
    static String baseUrl = "https://yummyanime.club/";  // base url

    @BeforeClass
    public static void setup ()  {

        System.setProperty("webdriver.chrome.driver", // chromeDriver is storring locally
                "C:\\Users\\Владелец\\Downloads\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();  // driver initialization
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // waits

    }

    @AfterClass
    public static void close () {
        driver.close();
    }
}










