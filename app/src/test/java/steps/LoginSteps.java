package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class LoginSteps {
    Login loGin= new Login();

    @Given("^Como usuario ingreso al formulario por medio de la url$")
    public void goToNavigateUrl(){
        loGin.GoToUrl3();
    }

    @When("^Se dirige a la seccion dando click en inicio de sesion$")
    public void clickLogin(){
        loGin.clickLogin();
    }
    @Then("^Se visualiza un formulario de inicio de sesion$")
    public void resultLogin(){
        loGin.comprobarResultLogin();
    }
}
