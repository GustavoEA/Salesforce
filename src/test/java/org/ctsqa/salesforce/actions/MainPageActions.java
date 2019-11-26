package org.ctsqa.salesforce.actions;


import static org.ctsqa.salesforce.elements.MainPageElements.*;

public class MainPageActions {



    public void changeView() {
        APP_LAUNCHER.click();
        SALES_BTN.click();
    }

    public void accessToLogin(){
       LOGIN_BTN.click();
    }
    public void accessToLightningPlatform(){
        PRODUCTS.hover();
        LIGHTNING_PLATFORM.click();
    }

    public void privacity() {
        PRIVACY.click();
    }


}
