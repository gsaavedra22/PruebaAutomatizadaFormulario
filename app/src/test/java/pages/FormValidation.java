package pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormValidation extends TheBase {

    public String ButtonText = "//*[@id='details-button']";
    public String linkTextButton = "//*[@id='proceed-link']";
    public String Nombre = "//input[@id='nombre']";
    public String Email = "//body/div[1]/form[1]/div[2]/div[1]/input[1]";
    public String Barrio = "//body/div[1]/form[1]/div[3]/div[1]/input[1]";
    public String Asunto = "//body/div[1]/form[1]/div[4]/div[1]/input[1]";
    public String Mensaje = "//body/div[1]/form[1]/div[5]/textarea[1]";

    public FormValidation() {
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
    }

    public void allInputs() {
        WebElement elementname = driver.findElement(By.xpath(Nombre));
        elementname.click();
        WebElement elementemail = driver.findElement(By.xpath(Email));
        elementemail.click();
        WebElement elementBarrio = driver.findElement(By.xpath(Barrio));
        elementBarrio.click();
        WebElement elementAsunto = driver.findElement(By.xpath(Asunto));
        elementAsunto.click();
        WebElement elementMensaje = driver.findElement(By.xpath(Mensaje));
        elementMensaje.click();

    }

    public void validateMessage() {
        assertTrue(driver
                .findElement(By.xpath("//p[contains(text(),'El nombre debe ser mayor a 4 letras y no debe incl')]"))
                .isDisplayed());

        assertTrue(driver.findElement(By.xpath("//body/div[1]/form[1]/div[2]/p[1]")).isDisplayed());

        assertTrue(driver.findElement(By.xpath("//body/div[1]/form[1]/div[3]/p[1]")).isDisplayed());

        assertTrue(driver.findElement(By.xpath("//body/div[1]/form[1]/div[4]/p[1]")).isDisplayed());
    }

}
