package org.ctsqa.salesforce.pageObjects;

import org.ctsqa.salesforce.actions.GeneralActions;
import org.ctsqa.salesforce.actions.LeadsActions;
import org.ctsqa.salesforce.actions.LoginActions;
import org.ctsqa.salesforce.actions.MainPageActions;
import org.junit.Test;

public class JunitRunner {


    private MainPageActions mainPageActions = new MainPageActions();
    private GeneralActions generalActions = new GeneralActions();
    private LoginActions loginActions = new LoginActions();
    private LeadsActions leadsActions = new LeadsActions();



    @Test
    public void accessLogin() {
        generalActions.openBrowser();
        mainPageActions.privacy();
        loginActions.login();

        mainPageActions.openSales();

        leadsActions.leadsNew();

        leadsActions.details();

        leadsActions.moreActions();
        leadsActions.convertLead();

        leadsActions.modifyOpportunity();
        leadsActions.closeLead();


        
    }
}
