package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheBase {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GSAURER\\Desktop\\chromedriver2.exe");
        ChromeOptions chromeoptions = new ChromeOptions();
        driver = new ChromeDriver(chromeoptions);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public TheBase(WebDriver driver) {
        TheBase.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public static void navigateUrl(String url) {
        driver.get(url);

    }

    public static WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

    }

    public static void closeBrowser() {
        driver.quit();
    }

}
