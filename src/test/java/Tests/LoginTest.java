package Tests;

import Configuration.TestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;

public class LoginTest extends TestRunner {

    @Test
    public void Login ()  {

         driver.findElement(By.className("login")).click();
    //     driver.findElement(By.cssSelector(".login-form input")).sendKeys(""); LOGIN INPUT     - to make it work you should register on https://yummyanime.club/
    //     driver.findElement(By.name("password")).sendKeys("");                 PASSWORD INPUT  - to make it work you should register on https://yummyanime.club/
         driver.findElement(By.cssSelector("body > div.top > div > div > div > form > input.login")).click();

    }
    @Test
    public void Verification (){
        String ExpectedMessage = "С возвращением, OriYori :-)";
        String ActualText = driver.findElement(By.xpath("/html/body/div[3]/div[3]")).getText();
        assertTrue(ActualText.contains(ExpectedMessage));
        System.out.println("User is logged in");
}
    }
