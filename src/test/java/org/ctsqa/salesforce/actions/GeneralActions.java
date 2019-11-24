package org.ctsqa.salesforce.actions;

import static com.codeborne.selenide.Selenide.open;
import static org.ctsqa.salesforce.elements.MainPageElements.COOKIES;

public class GeneralActions {


    public void openBrowser() {
        open("https://developer.salesforce.com/");
    }

    public void killCookies() {COOKIES.click();}

}


