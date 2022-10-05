package pages;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class SignIn extends TheBase {

    public String ButtonText = "//*[@id='details-button']";
    public String linkTextButton = "//*[@id='proceed-link']";
    public String LinkTextRegistrate = "Regístrate";
    public String ResultSignIn="//body//p";

    public SignIn() {
        super(driver);

    }

    public void GoToUrl2() {
        navigateUrl("https://178.128.77.104/Softesting/Frontend/Caso1.html");
        List<WebElement> elements = driver.findElements(By.xpath(ButtonText));

        if (elements.size() > 0) {
            WebElement element = driver.findElement(By.xpath(ButtonText));
            element.click();
            element = driver.findElement(By.xpath(linkTextButton));
            element.click();
        }
    }

    public void clickSignIn(){
        WebElement elementSign= driver.findElement(By.linkText(LinkTextRegistrate));
        elementSign.click();
    }

    public void comprobarResult(){
        WebElement ResultSign =driver.findElement(By.xpath(ResultSignIn));
        assertNotEquals("The requested URL /Softesting/Frontend/login.html was not found on this server.",ResultSign.getText());
    }
    
    public void BrowserClse(){
        TheBase.closeBrowser();

    }

}
