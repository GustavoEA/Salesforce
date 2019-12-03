package org.ctsqa.salesforce.elements;

        import com.codeborne.selenide.Condition;
        import com.codeborne.selenide.SelenideElement;
        import cucumber.api.java.eo.Se;
        import org.openqa.selenium.By;

        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.$;

public class LeadsElements {

    //    Open New LEAD
    public static final SelenideElement LEADS_DROPDOWN_BTN = $(byXpath("/html/body/div[5]/div[1]/section/header/div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a"));
    public static final SelenideElement NEW_LEAD = $(byXpath("/html/body/div[5]/div[1]/section/header/div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/div/div/slot/one-app-nav-bar-menu-item[1]"));

    //    New Lead Data
    public static final SelenideElement SALUTATION_BTN = $(byXpath("//div/div[2]/div[1]/div/div/fieldset/div/div[1]/div"));
    public static final SelenideElement SALUTATION_MR = $(byXpath("//a[contains(text(),'Mr.')]"));
    public static final SelenideElement FIRST_NAME= $(byClassName("firstName"));
    public static final SelenideElement LAST_NAME = $(byClassName("lastName"));
    public static final SelenideElement COMPANY = $(byXpath("//div[1]/div[1]/div[1]/div[3]/div[1]//input[1]"));
    public static final SelenideElement TITLE = $(byXpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public static final SelenideElement MAIL = $(byXpath("//div[4]/div[2]/div[1]/div[1]/div[1]/input[1]"));
    public static final SelenideElement LEAD_SOURCE = $(byXpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
    public static final SelenideElement SOURCE_WEB = $(byXpath("/html[1]/body[1]/div[11]/div[1]/ul[1]/li[2]/a[1]"));
    public static final SelenideElement INDUSTRY = $(byXpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    public static final SelenideElement INDUSTRY_APPAREL = $(byXpath("/html[1]/body[1]/div[12]/div[1]/ul[1]/li[3]/a[1]"));
    public static final SelenideElement CITY = $(byXpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
    public static final SelenideElement COUNTRY = $(byXpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[3]/div[2]/div[1]/input[1]"));
    public static final SelenideElement SAVE_BTN = $(byTitle("Save"));

    //    Details
    public static final SelenideElement DETAILS_BTN = $(byText("Details"));

    //    More Actions
    public static final SelenideElement MORE_ACTIONS_BTN = $(byXpath("//a[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']"));
    //public static final SelenideElement CONVERT = $(byXpath("//div[@class='branding-actions actionMenu']//li[6]//a[1]"));

    //    Convert Lead
    public static final SelenideElement HIDE_ACCOUNT_BTN = $(byXpath("//span[@class='slds-truncate slds-text-heading_x-small displayLabel'][contains(text(),'Account')]"));
    public static final SelenideElement CONVERT_BTN = $(byXpath("/html[1]/body[1]/div[10]/div[1]/ul[1]/li[6]/a[1]"));
    //public static final SelenideElement CONVERT_BTN = $(byXpath("//div[@class='modal-footer slds-modal__footer']//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton runtime_sales_leadConvertModalFooter']"));
    public static final SelenideElement FINISH_CONVERT = $(byXpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton runtime_sales_leadConvertModalFooter']"));
    public static final SelenideElement GOTOLEADS_BTN =$(byXpath("//div[@class='modal-footer slds-modal__footer']//button[@class='slds-button slds-button_brand']"));

    //     Modify Opportunity

    //      Close Lead








}
