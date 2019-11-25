package org.ctsqa.salesforce.actions;


import static org.ctsqa.salesforce.elements.MainPageElements.*;

public class MainPageActions {


    public void accessToLogin(){
       LOGIN_BTN.click();
    }
    public void accessTolightningPlatform(){
        PRODUCTS.hover();
        LIGHTNING_PLATFORM.click();
    }

    public void privacity() {
        PRIVACITY.click();
    }


}
