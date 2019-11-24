package org.ctsqa.salesforce.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.ctsqa.salesforce.actions.GeneralActions;

public class StepsDefinitions {


    @Steps
    private
    GeneralActions generalActions;


    @Given("A logged user access to Salesforce")
    public void userLoggedAccess() {
        generalActions.openBrowser();
        generalActions.killCookies();
    }

    @Then("Search for a flight to Rome")
    public void selectFlight() {

    }

    @And("Go through the booking process")
    public void bookingProcess() {

    }

    @Then("Check the invalid payment")
    public void checkInvalidPayment() {

    }

}
