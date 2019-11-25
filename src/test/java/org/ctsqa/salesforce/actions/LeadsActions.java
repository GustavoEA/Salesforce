package org.ctsqa.salesforce.actions;

import com.codeborne.selenide.Selenide;
import net.thucydides.core.pages.components.Dropdown;
import org.ctsqa.salesforce.elements.LeadsElements;
import org.junit.Test;


public class LeadsActions {


    @Test
    public void LeadsNew() {

        LeadsElements.LEADS_LABEL.click();
        LeadsElements.LEADS_NEW.click();
        //LeadsElements.NEWLEAD_SALUTATION.click();
        LeadsElements.NEWLEAD_FIRSTNAME.setValue("Invent");
        LeadsElements.NEWLEAD_LASTNAME.setValue("total");
        LeadsElements.NEWLEAD_COMPANY.setValue("company");







    }

}
