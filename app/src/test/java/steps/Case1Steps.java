package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GoToCase1;

public class Case1Steps {
    GoToCase1 gocase1 = new GoToCase1();

    @Given("^El usuario ingresa al formulario con la url del caso 1$")
    public void goToUrl() {
        gocase1.navigateToUrl();
    }

    @And("^Se dirige a la seccion Caso 1$")
    public void goToCas1() {
        gocase1.clickLinkTextCase1();
    }

    @Then("^Se visualiza el formulario del caso 1$")
    public void formCase1() {
        gocase1.compareBodyCase1Text();
    }
}
