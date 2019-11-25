package org.ctsqa.salesforce.actions;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ctsqa.salesforce.elements.LoginElements.*;

public class LoginActions {

    MainPageActions mainPageActions = new MainPageActions();

    public void login() {

        mainPageActions.accessToLogin();
        USERNAME.sendKeys("Ryanairtestermaster@gmail.com");
        PASSWORD.sendKeys("Ryanair123");
        LOGIN_BTN.click();
        
    }

}
