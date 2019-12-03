package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {

    //    Open "SALES"
    public static final SelenideElement APP_LAUNCHER = $(byXpath("//div[@class='slds-icon-waffle']"));
    public static final SelenideElement SALES_BTN = $(byLinkText("Sales"));
////    public static final SelenideElement SALES_BTN = $(byXpath("/html/body/div[5]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/section/div/ul/li[8]/div/div/div/div[2]"));

////    Mm a verse que linkText es algo "flojo" segun los expertos pero los dos SALES_BTN funcionan usa el que mas te guste yo voy a ver si este es mas estable.

//         Login
    public static final SelenideElement LOGIN_BTN = $(byXpath("//a[contains(text(),'Login')]"));

    //     Accept cookies and
    public static final SelenideElement PRIVACY = $(byId("onetrust-accept-btn-handler"));

}
