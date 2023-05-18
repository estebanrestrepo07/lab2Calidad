package com.bancolombia.personas.calidad.stepdefinitions;

import com.bancolombia.personas.calidad.tasks.OpenThe;
import com.bancolombia.personas.calidad.userInterfaces.UserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
@RunWith(Cucumber.class)
public class OpenBancolombiaPersonasMainPageStepDefinition {
    @Managed(driver ="chrome")
    public WebDriver driver;
    private Actor student = Actor.named("Esteban");

    @Before
    public void preStage(){
        student.can(BrowseTheWeb.with(driver));
    }

    @Given("User is in bancolombia people's page")
    public void given(){
        //todo interactions
        driver.manage().window().maximize();
        student.can(BrowseTheWeb.with(driver));
    }

    @When("user clicks the button to get a new credit")
    public void when(){
        // todo tasks
        student.attemptsTo(OpenThe.Browser(new UserPage()));
    }


    @Then("user can see the page to get a bancolombia credit for  people")
    public void then(){
        // todo questions
//        throw new PendingException();
    }

}
