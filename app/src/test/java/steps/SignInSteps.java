package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignIn;

public class SignInSteps {
    
    SignIn signIn= new SignIn();
    @Given("^Como usuario ingreso al formulario con el link de este$")
    public void navigateUrlS(){
        signIn.GoToUrl2();
    }
    @When("^Se dirige a la seccion de registro$")
    public void clickRegist(){
        signIn.clickSignIn();

    }
    @Then("^Se visualiza un formulario de registro$")
    public void resultRegist(){
        signIn.comprobarResult();
    }
}
