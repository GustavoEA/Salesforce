package org.ctsqa.salesforce.actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ctsqa.salesforce.elements.LeadsElements.*;


public class LeadsActions {



    public void leadsNew() {

        LEADS_DROPDOWN_BTN.click();
        NEW_LEAD.click();
        sleep(2000);
        SALUTATION_BTN.click();
        SALUTATION_MR.click();
        FIRST_NAME.setValue("Invent");
        LAST_NAME.setValue("total");
        COMPANY.setValue("company");
        TITLE.setValue("CEO");
        sleep(1000);
        MAIL.setValue("inv@Domain.com");
        LEAD_SOURCE.click();
        SOURCE_WEB.click();
//        INDUSTRY.click();
//        INDUSTRY_APPAREL.click();
//        CITY.setValue("Madrid");
//        COUNTRY.setValue("Spain");


        SAVE_BTN.click();
    }

    public void details(){
        DETAILS_BTN.click();
    }
    public void moreActions(){
        MORE_ACTIONS_BTN.click();
        CONVERT.click();
    }

    @Test
    public void convertLead() {
        //OPPORTUNITY.click();
        //OPPORTUNITY_NAME.setValue("test");
        HIDE_ACCOUNT_BTN.click();
        sleep(2000);
        CONVERT_BTN.click();
        sleep(2000);
        CONVERT_BTN.click();
        GOTOLEADS_BTN.click();
        OPPORTUNITY_ARROW.click();
        sleep(1000);
        FIRST_OPPORTUNITY.click();
        DETAILS_LABEL.click();
        EDIT_COMPETITORS.click();
        COMPETITORS.setValue("some");









    }
}
