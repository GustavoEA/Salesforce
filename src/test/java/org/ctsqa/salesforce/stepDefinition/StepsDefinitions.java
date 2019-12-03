package org.ctsqa.salesforce.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.ctsqa.salesforce.actions.*;

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

    @Steps
    private
    OportunityActions oportunityActions;


    @Given("^a user is logged into SalesForce$")
    public void userLoggedAccess() {
        generalActions.openBrowser();
        mainPageActions.privacy();
        loginActions.login();
    }

    @When("^the user opens Sales$")
    public void openSales() {
        mainPageActions.openSales();
    }

    @When("^creates a new Lead$")
    public void newLead() {
        leadsActions.leadsNew();
    }

    @When("^checks Details$")
    public void checkDetails() {
        leadsActions.details();
    }

    @When("^converts the Lead$")
    public void convertLead() {
        leadsActions.moreActions();
        leadsActions.convertLead();
    }

    @When("^modifies the Opportunity$")
    public void modifyOpportunity() {
        oportunityActions.modifyOpportunity();
    }

    @When("^closes the Lead$")
    public void closeLead() {
        oportunityActions.closeOportunity();
    }

    @Then("^the user should see the lead created and closed \"(.*)\"")
    public void leadCreatedClosed() {
    }

    @Given("All the test in one")
    public void alltestinone() {
//#    Given a user is logged into Salesforce
        generalActions.openBrowser();
        mainPageActions.privacy();
        loginActions.login();

//#    When the user opens Sales
        mainPageActions.openSales();

//#    And creates a new Lead
        leadsActions.leadsNew();
//      And checks the details
        leadsActions.details();

//#    And converts the Lead
        leadsActions.moreActions();
        leadsActions.convertLead();

//#    And modifies the Opportunity
        oportunityActions.modifyOpportunity();
//#    And closes the Lead
        oportunityActions.closeOportunity();


    }
}
