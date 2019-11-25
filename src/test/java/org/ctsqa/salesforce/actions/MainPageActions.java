package org.ctsqa.salesforce.actions;


import org.junit.Test;

import static org.ctsqa.salesforce.elements.MainPageElements.*;

public class MainPageActions {


    @Test
    public void changeView() {
        APP_LAUNCHER.click();
        SALES_LAUNCH.click();
    }

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
