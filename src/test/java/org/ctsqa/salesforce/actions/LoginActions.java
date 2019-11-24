package org.ctsqa.salesforce.actions;

import org.ctsqa.salesforce.elements.LoginElements;
import org.ctsqa.salesforce.elements.MainPageElements;

public class LoginActions {


    public void login(){

        LoginElements.USERNAME.sendKeys("Ryanairtestermaster@gmail.com");
        LoginElements.PASSWORD.sendKeys("Ryanair123");

    }

}
