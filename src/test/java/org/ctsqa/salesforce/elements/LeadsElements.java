package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;

public class LeadsElements {

    public static final SelenideElement LEADS_LABEL = $(byTitle("Leads"));
    public static final SelenideElement LEADS_NEW = $(byId("New"));

}
