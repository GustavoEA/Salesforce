package org.ctsqa.salesforce.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import org.ctsqa.salesforce.actions.GeneralActions;
import org.ctsqa.salesforce.actions.LeadsActions;
import org.ctsqa.salesforce.actions.LoginActions;
import org.ctsqa.salesforce.actions.MainPageActions;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ctsqa.salesforce.elements.LeadsElements.*;
import static org.ctsqa.salesforce.elements.MainPageElements.APP_LAUNCHER;
import static org.ctsqa.salesforce.elements.MainPageElements.SALES_BTN;

public class StepsDefinitions {


    @Steps
    private
    GeneralActions generalActions;

    @Steps
    private
    LeadsActions leadsActions;

    @Steps
    private
    MainPageActions mainPageActions;

    @Steps
    private
    LoginActions loginActions;


    @Given("^a user is logged into \"(.*)\"")
    public void userLoggedAccess() {
        generalActions.openBrowser();
        mainPageActions.privacy();
        loginActions.login();
    }

    @When("^the user opens \"(.*)\"")
    public void openSales() {
        mainPageActions.openSales();
    }

    @When("^creates a new \"(.*)\"")
    public void newLead(){
       leadsActions.leadsNew();
    }

    @When("^checks \"(.*)\"")
    public void checkDetails(){
        leadsActions.details();
    }
    @When("^checks \"(.*)\"")
    public void checkMoreActions(){
        leadsActions.moreActions();
    }
    @When("^converts the \"(.*)\"")
    public void convertLead(){
        leadsActions.convertLead();
    }
    @When("^modifies the \"(.*)\"")
    public void modifyOpportunity(){
        leadsActions.modifyOpportunity();
    }
    @When("^closes the \"(.*)\"")
    public void closeLead(){
        leadsActions.closeLead();
    }
    @Then("^the user should see the lead created and closed \"(.*)\"")
    public void leadCreatedClosed(){

    }
}
