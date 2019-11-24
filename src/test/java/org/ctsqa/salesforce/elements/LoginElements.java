package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginElements {


    public static final SelenideElement USERNAME = $(byId("username"));
    public static final SelenideElement PASSWORD = $(byId("password"));

}
