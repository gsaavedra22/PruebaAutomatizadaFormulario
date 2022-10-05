package pages;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class GoToCase2 extends TheBase {
    public String ButtonText = "//*[@id='details-button']";
    public String linkTextButton = "//*[@id='proceed-link']";
    public String ElementCase2 = "//a[contains(text(),'Caso 2')]";
    public String resultCase2="//body//p";

    public GoToCase2() {
        super(driver);

    }

    public void GoToUrl(){
        navigateUrl("https://178.128.77.104/Softesting/Frontend/Caso1.html");
        List<WebElement> elements = driver.findElements(By.xpath(ButtonText));

        if (elements.size() > 0) {
            WebElement element = driver.findElement(By.xpath(ButtonText));
            element.click();
            element = driver.findElement(By.xpath(linkTextButton));
            element.click();
        }
    }

    public void clickLinkTextCase2(){
        WebElement element2= driver.findElement(By.xpath(ElementCase2));
        element2.click();
    }

    public void compareTextCase2(){
        WebElement case2 =driver.findElement(By.xpath(resultCase2));
        assertNotEquals("The requested URL /Frontend/Caso2.html was not found on this server.",case2.getText());
    }

    public void BrowserClse(){
        TheBase.closeBrowser();

    }

}
