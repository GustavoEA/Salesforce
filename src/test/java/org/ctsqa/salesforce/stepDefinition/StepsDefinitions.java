package org.ctsqa.salesforce.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import org.ctsqa.salesforce.actions.GeneralActions;

import static org.ctsqa.salesforce.elements.MainPageElements.APP_LAUNCHER;
import static org.ctsqa.salesforce.elements.MainPageElements.SALES_BTN;

public class StepsDefinitions {


    @Steps
    private
    GeneralActions generalActions;















    @Given("a user is logged into the webpage")
    public void userLoggedAccess() {
        generalActions.openBrowser();
        generalActions.killCookies();
    }

    @When("the user opens Sales")
    public void openSales() {
        APP_LAUNCHER.click();
        SALES_BTN.click();

    }



    @Then("Check the invalid payment")
    public void checkInvalidPayment() {

    }

}
