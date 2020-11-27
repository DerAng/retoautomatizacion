package co.com.choucair.certification.retoautomatizacion.stepdefinitions;


import co.com.choucair.certification.retoautomatizacion.model.User;
import co.com.choucair.certification.retoautomatizacion.questions.Answer;
import co.com.choucair.certification.retoautomatizacion.tasks.*;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}


    @Given("^than Rose want to subscribe to the uTest platform$")
    public void thanRoseWantToSubscribeToTheUTestPlatform() {

        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(),GoTo.theForm());

    }

    @When("^she fills out the registration form$")
    public void sheFillsOutTheRegistrationForm(List<User> user) {

        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theForm(user.get(0)));

    }

    @Then("^she finds the message called (.*)$")
    public void sheFindsTheMessageCalledTheLastStep(String message) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(message)));

    }






}
