package org.ctsqa.salesforce.actions;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ctsqa.salesforce.elements.OportunityElements.*;

public class OportunityActions {


    public void modifyOpportunity() {
        OPPORTUNITY_ARROW.click();
        sleep(1000);
        FIRST_OPPORTUNITY.click();
        DETAILS_LABEL.click();
        EDIT_COMPETITORS.click();
        COMPETITORS.setValue("some");
        SAVE_OPPORTUNITY_BTN.click();
    }
    public void closeOportunity() {
        CLOSED_TAB.scrollIntoView(false);
        CLOSED_TAB.click();
        SELECT_CLOSED.click();

    }

}
