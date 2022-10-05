package pages;

import static org.junit.Assert.assertNotEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoToCase1 extends TheBase {

    public String ButtonText = "//*[@id='details-button']";
    public String linkTextButton = "//*[@id='proceed-link']";
    public String LinkTextCaso1 = "/html/body/header/div/div/nav/a[1]";
    public String FormCaseOne = "//body//p";

    public GoToCase1() {
        super(driver);
    }

    public void navigateToUrl() {
        navigateUrl("https://178.128.77.104/Softesting/Frontend/Caso1.html");
        List<WebElement> elements = driver.findElements(By.xpath(ButtonText));

        if (elements.size() > 0) {
            WebElement element = driver.findElement(By.xpath(ButtonText));
            element.click();
            element = driver.findElement(By.xpath(linkTextButton));
            element.click();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickLinkTextCase1() {
        WebElement elementCas1 = driver.findElement(By.xpath(LinkTextCaso1));
        elementCas1.click();

    }

    public void compareBodyCase1Text() {
        System.out.println(FormCaseOne);
        WebElement elementToFind = driver.findElement(By.xpath(FormCaseOne));
        assertNotEquals("The requested URL /Frontend/Caso1.html was not found on this server.",
                elementToFind.getText());
    }

    public void browserClose() {
        TheBase.closeBrowser();
    }
}
