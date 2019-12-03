package org.ctsqa.salesforce.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OportunityElements {
    public static final SelenideElement OPPORTUNITY_ARROW = $(byXpath("/html[1]/body[1]/div[5]/div[1]/section[1]/header[1]/div[3]/one-appnav[1]/div[1]/one-app-nav-bar[1]/nav[1]/div[1]/one-app-nav-bar-item-root[2]/one-app-nav-bar-item-dropdown[1]/div[1]"));
    public static final SelenideElement FIRST_OPPORTUNITY = $(byXpath("//div[@class='slds-dropdown slds-dropdown--center slds-nubbin--top']//div[@class='menuItemsWrapper']//one-app-nav-bar-menu-item[2]"));
    public static final SelenideElement DETAILS_LABEL = $(byXpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[@class='title'][contains(text(),'Details')]"));
    public static final SelenideElement EDIT_COMPETITORS= $(byTitle("Edit Main Competitor(s)"));
    public static final SelenideElement COMPETITORS = $(byXpath("/html[1]/body[1]/div[5]/div[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]//input[1]"));
    public static final SelenideElement SAVE_OPPORTUNITY_BTN = $(byXpath("//button[contains(@class,'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton')]"));

    public static final SelenideElement CLOSED_TAB = $(byXpath("//div[contains(@class,'windowViewMode-normal oneContent active lafPageHost')]//li[9]//a[1]"));
    public static final SelenideElement SELECT_CLOSED = $(byXpath("//button[contains(@class,'slds-button slds-button--brand slds-path__mark-complete stepAction active uiButton')]"));

}
