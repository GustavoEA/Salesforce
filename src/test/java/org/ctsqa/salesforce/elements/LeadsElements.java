package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LeadsElements {

    public static final SelenideElement LEADS_LABEL = $(byTitle("Leads"));
    public static final SelenideElement LEADS_NEW = $(byTitle("New"));
    //public static final SelenideElement NEWLEAD_SALUTATION = $(byXpath("//article[1]//div[1]/div[1]/div[1]/div[2]//a[1]"));
    public static final SelenideElement NEWLEAD_FIRSTNAME= $(byClassName("firstName"));
    public static final SelenideElement NEWLEAD_LASTNAME = $(byClassName("lastName"));
    public static final SelenideElement NEWLEAD_COMPANY = $(byXpath("//div[1]/div[1]/div[1]/div[3]/div[1]//input[1]"));
    public static final SelenideElement NEWLEAD_SAVE_BUTTON = $(byTitle("Save"));

}
