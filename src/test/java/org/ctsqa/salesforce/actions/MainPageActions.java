package org.ctsqa.salesforce.actions;


import static org.ctsqa.salesforce.elements.MainPageElements.*;

public class MainPageActions {



    public void privacy() {
        PRIVACY.click();
    }

    public void openSales() {
        APP_LAUNCHER.click();
        SALES_BTN.click();
    }

    public void accessToLogin(){
       LOGIN_BTN.click();
    }


}
