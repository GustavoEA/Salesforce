package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {


    public static final SelenideElement LOGIN_BTN = $(byId("login-button"));
    public static final SelenideElement COOKIES = $(byId("dfc-cookie-info-bar-button"));
    public static final SelenideElement PRODUCTS = $(byXpath("//*[@id=\"nav-to-highlight-based-on-url2\"]/li[1]/a"));
    public static final SelenideElement LIGHTNING_PLATFORM = $(byXpath("//*[@id=\"nav-to-highlight-based-on-url2\"]/li[1]/ul/li/div[1]/ul/li[1]/a"));
}
