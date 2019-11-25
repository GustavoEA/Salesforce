package org.ctsqa.salesforce.actions;

import com.codeborne.selenide.Selenide;
import org.ctsqa.salesforce.elements.LeadsElements;
import org.junit.Test;


public class LeadsActions {

    @Test
    public void LeadsGeneralActions() {


    }

    @Test
    public void LeadsNew() {

        LeadsElements.LEADS_LABEL.click();
        LeadsElements.LEADS_NEW.click();




    }

}
