package org.ctsqa.salesforce.actions;

import cucumber.api.java.it.Ma;

import static com.codeborne.selenide.Selenide.open;
import static org.ctsqa.salesforce.elements.MainPageElements.*;

public class GeneralActions {



    public void openBrowser() {
        open("https://salesforce.com/");

    }



    public void killCookies() {COOKIES.click();}

}


