package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GoToCase2;

public class Case2Steps {
    GoToCase2 gocase2 = new GoToCase2();

    @Given("^Como usuario ingreso al formulario con la url del caso 2$")
    public void goToUrl2() {
        gocase2.GoToUrl();
    }

    @And("^Doy click a la seccion de caso 2$")
    public void linkTextcase2() {
        gocase2.clickLinkTextCase2();
    }

    @Then("^Se visualiza el formulario correspondiente al caso 2$")
    public void resultTheCase2() {
        gocase2.compareTextCase2();
    }
}
