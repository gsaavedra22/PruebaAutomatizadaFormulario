package pages;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Login extends TheBase {

    public String ButtonText = "//*[@id='details-button']";
    public String linkTextButton = "//*[@id='proceed-link']";
    public String LinkTextLogin="Iniciar sesión";
    public String ResultLogin="//body//p";
    

    public Login() {
        super(driver);
        
    }
    public void GoToUrl3() {
        navigateUrl("https://178.128.77.104/Softesting/Frontend/Caso1.html");
        List<WebElement> elements = driver.findElements(By.xpath(ButtonText));

        if (elements.size() > 0) {
            WebElement element = driver.findElement(By.xpath(ButtonText));
            element.click();
            element = driver.findElement(By.xpath(linkTextButton));
            element.click();
        }
    }

    public void clickLogin(){
        WebElement elementLogin = driver.findElement(By.linkText(LinkTextLogin));
        elementLogin.click();
        
        
    }
    
    public void comprobarResultLogin(){
        WebElement ResultLogin1 =driver.findElement(By.xpath(ResultLogin));
        assertNotEquals("The requested URL /Softesting/Frontend/login.html was not found on this server.",ResultLogin1.getText());
    }
    
    public void BrowserClose1(){
        TheBase.closeBrowser();

    }
    
    
}
