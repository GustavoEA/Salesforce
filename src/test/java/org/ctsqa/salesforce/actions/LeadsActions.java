package org.ctsqa.salesforce.actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Enabled;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ctsqa.salesforce.elements.LeadsElements.*;


public class LeadsActions {


//    Estoy intentando separar las acciones y hacerlas mas concretas, que no cocretas mmm cocretas, creo que es hora de ir a comer
public void openNewLeadForm(){
    LEADS_DROPDOWN_BTN.click();
    NEW_LEAD.click();
}
    public void leadsNew() {
        sleep(2000);
        SALUTATION_BTN.click();
        SALUTATION_MR.click();
        FIRST_NAME.setValue("Invent");
        LAST_NAME.setValue("total");
        COMPANY.setValue("company");
        TITLE.setValue("CEO");
        sleep(2000);
        MAIL.setValue("inv@Domain.com");
        LEAD_SOURCE.click();
        SOURCE_WEB.click();
//       INDUSTRY.click();
//       INDUSTRY_APPAREL.click();
//        CITY.setValue("Madrid");
//        COUNTRY.setValue("Spain");


        SAVE_BTN.click();
    }

    public void details() {
        DETAILS_BTN.click();
    }

    public void moreActions() {
        MORE_ACTIONS_BTN.click();
    }

    public void convertLead() {
        CONVERT_BTN.click();
        //OPPORTUNITY.click();
        //OPPORTUNITY_NAME.setValue("test");
        HIDE_ACCOUNT_BTN.click();
        sleep(2000);
        FINISH_CONVERT.click();
        sleep(2000);
        FINISH_CONVERT.click();
        GOTOLEADS_BTN.click();
    }

}
