package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {

    public static final SelenideElement APP_LAUNCHER = $(byXpath("//div[@class='slds-icon-waffle']"));
    public static final SelenideElement SALES_BTN = $(byXpath("/html/body/div[5]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/section/div/ul/li[8]/div/div/div/div[2]"));
    //    Open "SALES"
    public static final SelenideElement LOGIN_BTN = $(byXpath("//a[contains(text(),'Login')]"));
    public static final SelenideElement PRIVACY = $(byId("onetrust-accept-btn-handler"));
    public static final SelenideElement COOKIES = $(byId("dfc-cookie-info-bar-button"));
}
