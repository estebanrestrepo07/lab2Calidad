package com.bancolombia.personas.calidad.stepdefinitions;

import com.bancolombia.personas.calidad.questions.ValidateCreditPage;
import com.bancolombia.personas.calidad.questions.ValidateSimulationCompletedPage;
import com.bancolombia.personas.calidad.questions.ValidateStartSimulationPage;
import com.bancolombia.personas.calidad.tasks.NavigateTo;
import com.bancolombia.personas.calidad.tasks.OpenThe;
import com.bancolombia.personas.calidad.tasks.StartThe;
import com.bancolombia.personas.calidad.userInterfaces.UserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(CucumberWithSerenity.class)
public class OpenBancolombiaPersonasMainPageStepDefinition {
    @Managed(driver ="chrome")
    public WebDriver driver;
    private final Actor student = Actor.named("Esteban");

    @Before
    public void preStage(){
        student.can(BrowseTheWeb.with(driver));
    }

    @Given("User is in bancolombia people's page")
    public void userInBancolombiaMainPage(){
        //todo interactions
        driver.manage().window().maximize();
        student.can(BrowseTheWeb.with(driver));
    }

    @When("user clicks the button to get a new credit")
    public void userClicksNewCreditBtn(){
        // todo tasks
        student.attemptsTo(OpenThe.Browser(new UserPage()));
    }

    @Then("user can see the page to get a bancolombia credit for people")
    public void userSeeCreditPage(){
        student.should(seeThat(ValidateCreditPage.validateCreditPage(), equalTo(true)));
    }


    @Given("User is in the page to get a bancolombia credit for people")
    public void userIsInCreditPage(){
        driver.manage().window().maximize();
        student.can(BrowseTheWeb.with(driver));
        driver.navigate().to("https://www.bancolombia.com/personas/creditos");
    }

    @When("user clicks on simulate credit")
    public void userClicksOnSimulateCredit(){
        student.attemptsTo(NavigateTo.CreditPage(new UserPage()));
    }

    @Then("user can see the page to start simulate the credit")
    public void userCanSeeStartSimulationPage(){
        student.should(seeThat(ValidateStartSimulationPage.validateStartSimulationPage(), equalTo(true)));
    }

    @Given("User is in the page to start simulate the credit")
    public void userIsInTheStartSimulationPage(){
        driver.manage().window().maximize();
        student.can(BrowseTheWeb.with(driver));
        driver.navigate().to("https://www.bancolombia.com/personas/creditos/consumo/credito-libre-inversion/simulador-libre-inversion");
    }

    @When("user fills the required information")
    public void userFillsRequiredInfo(){
        student.attemptsTo(StartThe.Simulation(new UserPage()));
    }

    @Then("user can simulate the credit and see the results")
    public void userSimulatesTheCredit(){
        student.should(seeThat(ValidateSimulationCompletedPage.validateSimulationCompletedPage(), equalTo(true)));
    }

}
