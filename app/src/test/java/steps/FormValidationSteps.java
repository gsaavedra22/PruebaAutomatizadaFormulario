package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.FormValidation;

public class FormValidationSteps {
    FormValidation valid = new FormValidation();

    @Given("^Como usuario ingreso al formulario con la url del formulario del caso 1$")
    public void navigateUrlAgain() {
        valid.navigateToUrl();
    }

    @And("^Se dejan los campos vacios$")
    public void clickInputs() {
        valid.allInputs();
    }

    @Then("^Se visualizan comentarios de aviso que no permiten dejar el campo vacio$")
    public void messageValidate() {
        valid.validateMessage();
    }
}
